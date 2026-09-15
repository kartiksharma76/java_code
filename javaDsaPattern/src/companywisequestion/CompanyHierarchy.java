package companywisequestion;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
	String name;
	List<TreeNode> children;

	TreeNode(String name) {
		this.name = name;
		children = new ArrayList<>();

	}
}

public class CompanyHierarchy {
	static boolean findPath(TreeNode root, String employee, List<String> path) {
		if (root == null)
			return false;

		path.add(root.name);
		if (root.name.equals(employee))
			return true;

		for (TreeNode child : root.children) {
			if (findPath(child, employee, path))
				return true;
		}
		path.remove(path.size() - 1);
		return false;
	}

	public static void main(String[] args) {
		TreeNode ceo = new TreeNode("CEO");
		TreeNode manager1 = new TreeNode("Manager1");
		TreeNode manager2 = new TreeNode("Manager2");

		TreeNode emp1 = new TreeNode("Employee1");

		ceo.children.add(manager1);
		ceo.children.add(manager2);

		manager1.children.add(emp1);

		List<String> path = new ArrayList<>();

		findPath(ceo, "Employee1", path);

		System.out.println(path);
	}
}
