package StackQuestions;

public class SpecialStackTest {
	public static void main(String[] args) {
	SpecialStack s = new SpecialStack();
	s.push(18);   
	s.push(19);  
	s.push(29);   
	s.push(15);
	s.push(16);
// Input: push 18, 19, 29, 15, 16         
	System.out.println(s.getMin()); 

}
}