package RGPV;

public abstract class Vehicle {
abstract void start();
void stop() {
	System.out.println("vehicle is stopping......");
}

}
class Car1 extends Vehicle{
	@Override
	void start() {
		System.out.println("class is starting with key ignition....");
		
}
}