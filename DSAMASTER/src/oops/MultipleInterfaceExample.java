package oops;

interface CameraFeature {

	void camera();
}

interface MusicFeature {

	void music();
}

class SmartPhone implements CameraFeature, MusicFeature {

	@Override
	public void camera() {
		System.out.println("50MP Camera");
	}

	@Override
	public void music() {
		System.out.println("Music Playing");
	}
}

public class MultipleInterfaceExample {

	public static void main(String[] args) {

		SmartPhone phone = new SmartPhone();

		phone.camera();
		phone.music();
	}
}