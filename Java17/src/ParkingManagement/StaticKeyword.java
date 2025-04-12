package ParkingManagement;

public class StaticKeyword {
	private static int count = 0;

	public StaticKeyword() {
		count++;
	}

	public static int getobjectcount() {
		return count;

	}

	public static void main(String[] args) {
		StaticKeyword co = new StaticKeyword();
		StaticKeyword co2 = new StaticKeyword();
		StaticKeyword co3 = new StaticKeyword();
		System.out.println("no of object:" + getobjectcount());
	}
}
