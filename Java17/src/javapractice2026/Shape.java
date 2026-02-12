package javapractice2026;

public interface Shape {
void draw();
	
}
class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Circle");
		
	}
	
}
class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("Square");
		
	}
	
}
