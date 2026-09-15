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
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;


public class WaterJugProblem {

    static class State {
        int jug1, jug2;

        public State(int j1, int j2) {
            jug1 = j1; 
            jug2 = j2;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            State state = (State) obj;
            return jug1 == state.jug1 && jug2 == state.jug2;
        }

        @Override
        public int hashCode() {
            return Objects.hash(jug1, jug2);
        }

        @Override
        public String toString() {
            return "(" + jug1 + ", " + jug2 + ")";
        }
    }

    public static List<String> solve(int jug1cap, int jug2cap, int target) {
        Queue<State> queue = new LinkedList<>();
        Set<State> visited = new HashSet<>();
        Map<State, State> parent = new HashMap<>();
        Map<State, String> action = new HashMap<>();

        State initialState = new State(0, 0);
        queue.add(initialState);
        visited.add(initialState);

        while (!queue.isEmpty()) {
            State current = queue.poll();

            if (current.jug1 == target || current.jug2 == target) {
                return buildPath(parent, action, current);
            }

            List<State> nextStates = new ArrayList<>();
            List<String> actions = new ArrayList<>();

            nextStates.add(new State(jug1cap, current.jug2));
            actions.add("Fill Jug1");

            nextStates.add(new State(current.jug1, jug2cap));
            actions.add("Fill Jug2");

            nextStates.add(new State(0, current.jug2));
            actions.add("Empty Jug1");

            nextStates.add(new State(current.jug1, 0));
            actions.add("Empty Jug2");

            int move1to2 = Math.min(current.jug1, jug2cap - current.jug2);
            nextStates.add(new State(current.jug1 - move1to2, current.jug2 + move1to2));
            actions.add("Move Jug1 to Jug2");

            int move2to1 = Math.min(current.jug2, jug1cap - current.jug1);
            nextStates.add(new State(current.jug1 + move2to1, current.jug2 - move2to1));
            actions.add("Move Jug2 to Jug1");

            for (int i = 0; i < nextStates.size(); i++) {
                State nextState = nextStates.get(i);
                if (!visited.contains(nextState)) {
                    visited.add(nextState);
                    queue.add(nextState);
                    parent.put(nextState, current);
                    action.put(nextState, actions.get(i));
                }
            }
        }

        return Collections.singletonList("No solution possible.");
    }

    private static List<String> buildPath(Map<State, State> parent, Map<State, String> action, State target) {
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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter capacity of Jug1: ");
        int jug1Cap = scanner.nextInt();

        System.out.print("Enter capacity of Jug2: ");
        int jug2Cap = scanner.nextInt();

        System.out.print("Enter target amount: ");
        int target = scanner.nextInt();

        List<String> solution = solve(jug1Cap, jug2Cap, target);

        System.out.println("\nSolution Steps :");
        for (int i = 0; i < solution.size(); i++) {
            System.out.println((i + 1) + ". " + solution.get(i));
        }

        scanner.close();
    }
}