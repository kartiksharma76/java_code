package games;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class RiverCrossingProblem {
	static class State {
		int man;
		int goat;
		int wolf;
		int cabbage;

		public State(int m, int g, int w, int c) {

			man = m;
			goat = g;
			wolf = w;
			cabbage = c;
		}

		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null || getClass() != obj.getClass()) {
				return false;
			}
			State s = (State) obj;
			return man == s.man && goat == s.goat && wolf == s.wolf && cabbage == s.cabbage;
		}

		public int hashCode() {
			return Objects.hash(man, goat, wolf, cabbage);
		}

		public String toString() {
			return "(" + man + "," + goat + "," + wolf + "," + cabbage + ")";
		}
	}

	public static List<String> solve() {
		Queue<State> queue = new LinkedList<>();
		Set<State> visited = new HashSet<>();
		Map<State, State> parent = new HashMap<>();
		Map<State, String> action = new HashMap<>();

		State initial = new State(0, 0, 0, 0);
		State goal = new State(1, 1, 1, 1);
		queue.add(initial);
		visited.add(initial);

		while (!queue.isEmpty()) {
			State current = queue.poll();

			if (current.man == 1 && current.goat == 1 && current.wolf == 1 && current.cabbage == 1) {
				return buildPath(parent, action, current);
			}

			if (!isSafe(current)) {
				continue;
			}

			List<State> nextStates = new ArrayList<>();
			List<String> actions = new ArrayList<>();

			int nextSide = 1 - current.man;

			nextStates.add(new State(nextSide, current.goat, current.wolf, current.cabbage));
			actions.add("Move alone");

			// move goat
			if (current.goat == current.man) {
				nextStates.add(new State(nextSide, nextSide, current.wolf, current.cabbage));
				actions.add("Move Goat");
			}
			// move wolf
			if (current.wolf == current.man) {
				nextStates.add(new State(nextSide, current.goat, nextSide, current.cabbage));
				actions.add("Move Wolf");
			}
			// move cabbage
			if (current.cabbage == current.man) {
				nextStates.add(new State(nextSide, current.goat, current.wolf, nextSide));
				actions.add("Move Cabbage");
			}
			for (int i = 0; i < nextStates.size(); i++) {
				State next = nextStates.get(i);
				if (!visited.contains(next) && isSafe(next)) {
					visited.add(next);
					queue.add(next);
					parent.put(next, current);
					action.put(next, actions.get(i));
				}
			}

		}
		return Collections.singletonList("No solution found");

	}

	private static boolean isSafe(State s) {
		if (s.goat == s.wolf && s.goat != s.man) {
			return false;

		}
		if (s.goat == s.cabbage && s.goat != s.man) {
			return false;
		}
		return true;
	}

	private static List<String> buildPath(Map<State, State> parent, Map<State, String> action, State target) {
		// TODO Auto-generated method stub
		List<String> path = new ArrayList<>();
		State current = target;
		Stack<String> stack = new Stack<>();

		while (parent.containsKey(current)) {
			stack.push(action.get(current));
			current = parent.get(current);
		}
		while (!stack.isEmpty()) {
			path.add(stack.pop());

		}
		return path;
	}

	public static void main(String[] args) {
		List<String> solution = solve();

		System.out.println("Solution Steps:");
		for (int i = 0; i < solution.size(); i++) {
			System.out.println((i + 1) + " " + solution.get(i));
		}
	}
}