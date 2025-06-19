package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
/**
 * 5
4 7 2 5 12
0 1 0 0 1
1 2
1 3
3 4
3 5
 */
enum Color {
	RED, GREEN
}

abstract class Tree {
	private int value;
	private Color color;
	private int depth;

	public Tree(int value, Color color, int depth) {
		this.value = value;
		this.color = color;
		this.depth = depth;
	}

	public int getValue() {
		return value;
	}

	public Color getColor() {
		return color;
	}

	public int getDepth() {
		return depth;
	}

	public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {
	private List<Tree> children = new ArrayList<>();

	public TreeNode(int value, Color color, int depth) {
		super(value, color, depth);
	}

	public void accept(TreeVis visitor) {
		visitor.visitNode(this);
		for (Tree child : children) {
			child.accept(visitor);
		}
	}

	public void addChild(Tree child) {
		children.add(child);
	}
}

class TreeLeaf extends Tree {
	public TreeLeaf(int value, Color color, int depth) {
		super(value, color, depth);
	}

	public void accept(TreeVis visitor) {
		visitor.visitLeaf(this);
	}
}

abstract class TreeVis {
	public abstract int getResult();

	public abstract void visitNode(TreeNode node);

	public abstract void visitLeaf(TreeLeaf leaf);
}

class SumInLeavesVisitor extends TreeVis {
	private int sum = 0;

	public int getResult() {
		return sum;
	}

	public void visitNode(TreeNode node) {
	}

	public void visitLeaf(TreeLeaf leaf) {
		sum += leaf.getValue();
	}
}

class ProductOfRedNodesVisitor extends TreeVis {
	private long product = 1;
	private final int MOD = 1000000007;

	public int getResult() {
		return (int) product;
	}

	public void visitNode(TreeNode node) {
		if (node.getColor() == Color.RED) {
			product = (product * node.getValue()) % MOD;
		}
	}

	public void visitLeaf(TreeLeaf leaf) {
		if (leaf.getColor() == Color.RED) {
			product = (product * leaf.getValue()) % MOD;
		}
	}
}

class FancyVisitor extends TreeVis {
	private int evenDepthSum = 0;
	private int greenLeafSum = 0;

	public int getResult() {
		return Math.abs(evenDepthSum - greenLeafSum);
	}

	public void visitNode(TreeNode node) {
		if (node.getDepth() % 2 == 0) {
			evenDepthSum += node.getValue();
		}
	}

	public void visitLeaf(TreeLeaf leaf) {
		if (leaf.getColor() == Color.GREEN) {
			greenLeafSum += leaf.getValue();
		}
	}
}

public class JavaVisitPattern {
	private static int[] values;
	private static Color[] colors;
	private static Map<Integer, Set<Integer>> treeMap = new HashMap<>();

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Tree root = solve();
		TreeVis vis1 = new SumInLeavesVisitor();
		TreeVis vis2 = new ProductOfRedNodesVisitor();
		TreeVis vis3 = new FancyVisitor();

		root.accept(vis1);
		root.accept(vis2);
		root.accept(vis3);

		System.out.println(vis1.getResult());
		System.out.println(vis2.getResult());
		System.out.println(vis3.getResult());

	}

	public static Tree solve() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		values = new int[n];
		for (int i = 0; i < n; i++)
			values[i] = in.nextInt();
		colors = new Color[n];
		for (int i = 0; i < n; i++)
		    colors[i] = in.nextInt() == 0 ? Color.RED : Color.GREEN;
		for (int i = 0; i < n - 1; i++) {
			int u = in.nextInt(), v = in.nextInt();
			treeMap.computeIfAbsent(u, k -> new HashSet<>()).add(v);
			treeMap.computeIfAbsent(u, k -> new HashSet<>()).add(u);
		}
		in.close();
		return buildTree(1, 0, new boolean[n + 1]);
	}

	private static Tree buildTree(int nodeId, int depth, boolean[] visited) {
		visited[nodeId] = true;
		Set<Integer> children = treeMap.get(nodeId);
		boolean isLeaf = true;

		TreeNode node = new TreeNode(values[nodeId - 1], colors[nodeId - 1], depth);
		TreeLeaf leaf = new TreeLeaf(values[nodeId - 1], colors[nodeId - 1], depth);

		if (children != null) {
			for (int childId : children) {
				if (!visited[childId]) {
					isLeaf = false;
					node.addChild(buildTree(childId, depth + 1, visited));
				}
			}
		}
		return isLeaf ? leaf : node;
	}
}
