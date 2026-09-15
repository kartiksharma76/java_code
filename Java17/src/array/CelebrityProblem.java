package Stack;

import java.util.Stack;
/**
* Problem
* 1).You are given a matrix M of size n x n where:
* 2).M[i][j] = 1 means person i knows person j
* 3).M[i][j] = 0 means person i does not know person j
* 4).A celebrity is defined as someone who:
* 5).Doesn't know anyone else (M[celebrity][j] == 0 for all j != celebrity)
* 6).Is known by everyone else (M[i][celebrity] == 1 for all i != celebrity)
* 7).Your task is to find the index of the celebrity if one exists, else return -1.
* 8).Optimal Algorithm (Using Stack) - O(n)
* 9).Push all n people to a stack.
* 10).Pop two people at a time and compare:
* 11).If A knows B, then A cannot be the celebrity. Push B back.
* 12).If A does not know B, then B cannot be the celebrity. Push A back.
* 13).Eventually, one person remains — check if that person is a celebrity.
*/
public class CelebrityProblem {
public static int findCelebrity(int[][]K, int n) {
	// push all data in stack 
	Stack<Integer> stack = new Stack<>();
	for(int i =0;i<n;i++) {
		stack.push(i);
	}
	// pop(elimination) the data in pair wise  use stack
	while(stack.size()>1) {
		int A= stack.pop();
		int B = stack.pop();
		// in here the data of array in a and b == 1 then the push data in B other wise push in A
		// in here A knows B => A is not a celebrity
		if(K[A][B]==1) {
			stack.push(B);
		}else {
			// A does not  knows B => B is not a celebrity
			stack.push(A);
		}
	}
	// and here verify the candidate who know the celebrity
	int candidate =stack.pop();
	// we must verify that this person satisfies both celebrity conditions
	for(int i=0;i<n;i++) {
		if(i != candidate) {
			if(K[candidate][i]==1 || K[i][candidate]==0) {
				return -1;
			}
		}
	}
	return candidate;
	
}
public static void main(String[] args) {
	int[][]M= {{0,1,1},{0,0,1},{0,0,0}};
	
	int n=3;
	int result = findCelebrity(M, n);
	
	if(result==-1) {
		System.out.println("No celebrity found");
		
	}else {
		System.out.println("celebrity is person :"+ result);
	}
}
}
