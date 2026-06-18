package trenningjava;

public class TemperatureConvertor implements Temperature {

	@Override
	public double cTof(double cell) {
		return (cell * 9 / 5) + 32;
	}

	@Override
	public double fToc(double fah) {
		return (fah - 32) * 5 / 9;
	}

	public static void main(String[] args) {
		Temperature t1 = new TemperatureConvertor();
		System.out.println("22.52 C =" + t1.cTof(22.52) + "F");
		System.out.println("23.55 C =" + t1.fToc(23.55) + "C");
	}
}
