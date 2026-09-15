package javabasics;

/**
 * 
 * | Keyword        | Purpose                                         |
| -------------- | ----------------------------------------------- |
| `public`       | Accessible everywhere                           |
| `private`      | Accessible only within class                    |
| `protected`    | Accessible in same package + subclasses         |
| `static`       | Belongs to class, not object                    |
| `final`        | Constant variable / method cannot be overridden |
| `abstract`     | Method without body                             |
| `native`       | Implemented in another language (C/C++)         |
| `synchronized` | Thread-safe method                              |
| `transient`    | Not saved during serialization                  |
| `volatile`     | Variable updated by multiple threads            |
| `strictfp`     | Ensures consistent floating-point calculations  |
--------------------------------------------------------------------
 * 
 */
public abstract strictfp class KeywordDemo {
	// volatile variable
	volatile int count = 0;

	// transient variable
	transient int tempData = 50;

	// final variable
	final int MAX = 100;

	// private variable
	private int privateVar = 10;

	// protected variable
	protected int protectedVar = 20;

	// public variable
	public int publicVar = 30;

	// static variable
	static int staticVar = 5;

	// synchronized method
	public synchronized void increment() {
		count++;
	}

	// final method
	public final void showFinal() {
		System.out.println("Final method executed");
	}

	// abstract method (must be implemented by subclass)
	public abstract void display();

	// native method declaration
	public native void nativeMethod();

	public static void main(String[] args) {

		System.out.println("Static variable: " + staticVar);

		KeywordDemo obj = new KeywordDemo() {

			@Override
			public void display() {
				System.out.println("Abstract method implemented");

			}

			public void nativeMethod() {
				System.out.println("Native method simulated");
			}

		};
		
		
		obj.increment();
		obj.showFinal();
		obj.display();
		obj.nativeMethod();

		System.out.println("Volatile count: " + obj.count);
	}
}
