package javainterview;

abstract class GraphicObject {
	int x, y;

	public GraphicObject(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void moveTo(int newX, int newY) {
		x = newX;
		y = newY;

		System.out.println("Moved to position: (" + x + ", " + y + ")");
	}

	abstract void draw();

	abstract void resize();
}

class Circle extends GraphicObject {

	public Circle(int x, int y) {
		super(x, y);

	}

	@Override
	void draw() {
		System.out.println("Drawing Circle at (" + x + ", " + y + ")");

	}

	@Override
	void resize() {
		System.out.println("Resizing Circle");

	}

}

class Rectangle extends GraphicObject {

	public Rectangle(int x, int y) {
		super(x, y);

	}

	@Override
	void draw() {
		System.out.println("Drawing Rectangle at (" + x + ", " + y + ")");

	}

	@Override
	void resize() {
		System.out.println("Resizing Rectangle");

	}

}

public class AbstractDemo {
	public static void main(String[] args) {
		// Object of Circle

		GraphicObject c = new Circle(10, 20);
		c.draw();
		c.resize();
		c.moveTo(30, 40);

		System.out.println("------------------");

		// Object of Rectangle
		GraphicObject r = new Rectangle(5, 5);
		r.draw();
		r.resize();
		r.moveTo(15, 25);
	}
}
