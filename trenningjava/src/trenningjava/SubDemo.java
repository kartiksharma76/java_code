package trenningjava;

public class SubDemo<Z, S> extends Demo<Z> {

	private S value;

	public SubDemo(Z data, S value) {
		super(data);
		this.value = value;
	}

	public S getValue() {
		return value;
	}

	public void setValue(S value) {
		this.value = value;
	}

	public static void main(String[] args) {

		SubDemo<String, Integer> sd = new SubDemo<>("Polo", 21);

		System.out.println(sd.getData() + "," + sd.getValue());
	}
}