package games;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;


/**
 * RULES-: 1.Boat hold max 2 people 2.Boat must have at least 1 person to move
 * 3.On either bank,if missionaries are present there number must be >= number
 * of cannibals otherwise number of cannibals - otherwise,missionaries get eaten
 * 4.initial state(3M,3C,Boat) on left bank - Goal(0M,0C) on left (3M,3C ,Boat)
 * on right
 * 
 * 
 */

class State {
	int missinonariesLeft, cannibalsLeft;
	int missionariesRight, cannibalsRight;
	boolean boatOnLeft;

	public State(int ml, int cl, int mr, int cr, boolean boat) {
		super();
		this.missinonariesLeft = ml;
		this.cannibalsLeft = cl;
		this.missionariesRight = mr;
		this.cannibalsRight = cr;
		this.boatOnLeft = boat;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		State state = (State) obj;
		return missinonariesLeft == state.missinonariesLeft && cannibalsLeft == state.cannibalsLeft
				&& missionariesRight == state.missionariesRight && cannibalsRight == state.cannibalsRight
				&& boatOnLeft == state.boatOnLeft;

	}
	public int hashCode() {
		return Objects.hash(missinonariesLeft, cannibalsLeft, missionariesRight, cannibalsRight, boatOnLeft);
		
	}
	public boolean isValid() {
		if(missinonariesLeft < 0 || cannibalsLeft <0 || missionariesRight < 0 || cannibalsRight < 0 ) {
			return true;
		}
		if ((missinonariesLeft > 0 && missinonariesLeft <cannibalsLeft) || (missionariesRight > 0 && missionariesRight <cannibalsRight)) {
 return false;			
		}
		return true;
		
	}
	public boolean isGoal() {
		return missinonariesLeft == 0 && cannibalsLeft == 0;
	}
	public String toString() {
		return String.format("(M:%d C:%d | Boat:%s | M:%d C:%d)",missinonariesLeft,cannibalsLeft,boatOnLeft ? "->L": "R->",missionariesRight, cannibalsRight);
		
	}
}
class Move {
	int m;
	int c;
	String Description;
	public Move(int m, int c, String description) {
		super();
		this.m = m;
		this.c = c;
		Description = description;
	}
}

public class MissionariesCannibals {
private static final List<Move> MOVES = Arrays.asList(new Move(1, 0, "1 Missionary"),
        new Move(2, 0, "2 Missionaries"),
        new Move(0, 1, "1 Cannibal"),
        new Move(0, 2, "2 Cannibals"),
        new Move(1, 1, "1 Missionary + 1 Cannibal"));

public static void solve() {
	Queue<State> queue = new LinkedList<>();
	  Map<State, State> parent = new HashMap<>();
      Set<State> visited = new HashSet<>();
      
      
      State initialState = new State(3, 3, 0, 0, true);
      queue.add(initialState);
      visited.add(initialState);
      
      
      while (!queue.isEmpty()) {
		State current = queue.poll();
		
		if (current.isGoal()) {
			printSolution(parent,current);
			return ;
			
		}
		for(Move move : MOVES) {
			State nextState = getNextState(current,move);
			if(nextState != null && nextState.isValid() && !visited.contains(nextState)) {
				visited.add(nextState);
				parent.put(nextState, current);
				queue.add(nextState);
			}
		}
	}
      System.out.println("No solution found !");
}

private static State getNextState(State current, Move move) {
	// TODO Auto-generated method stub
	if(current.boatOnLeft) {
		if(current.missinonariesLeft >= move.m && current.cannibalsLeft >= move.c) {
			return new State (current.missinonariesLeft - move.m,
                    current.cannibalsLeft - move.c,
                    current.missionariesRight + move.m,
                    current.cannibalsRight + move.c,
                    false
					);
					
		}
	}else {
		if (current.missionariesRight >= move.m && current.cannibalsRight >= move.c) {
			
			return new State(
				     current.missinonariesLeft + move.m,
	                    current.cannibalsLeft + move.c,
	                    current.missionariesRight - move.m,
	                    current.cannibalsRight - move.c,
	                    true
					);
					
		}
	}
	return null;
}

private static void printSolution(Map<State, State> parent, State goal) {
	// TODO Auto-generated method stub
	List<State> path = new ArrayList<>();
	State current = goal;
	
	while (current != null) {
		path.add(current);
		current =parent.get(current);
		
	}
	
	Collections.reverse(path);
	
	System.out.println("Solution Found !("+(path.size()-1)+ "moves)\n");
	for (int i = 0; i < path.size(); i++) {
		System.out.println("step " + i + ":  " +path.get(i));
	}
}
public static void main(String[] args) {
	System.out.println("Missionaries and Cannibals Problem Solver\n");
	solve();
}
}
