package telusco;

class Calc1 {
	public int add(int n1, int n2) {
		return n1 + n2;
	}

	public int sub(int n1, int n2) {
		return n1 - n2;
	}
}

class AdvCalc1 extends Calc1 {
	public int multi(int n1, int n2) {
		return n1 * n2;
	}

	public int div(int n1, int n2) {
		return n1 / n2;
	}
}

class veryAdvCalc extends AdvCalc1 {
	public double power(int n1, int n2) {
		return Math.pow(n1, n2);
	}

}

public class SingleAndMultilevelInheritance {
	public static void main(String[] args) {
//	Calc1 obj=new Calc1();
//	AdvCalc1 obj=new AdvCalc1();
		veryAdvCalc obj = new veryAdvCalc();
		int r1 = obj.add(4, 5);
		int r2 = obj.sub(7, 3);
		int r3 = obj.multi(5, 3);
		int r4 = obj.div(15, 4);
		double r5 = obj.power(4, 2);

		System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
	}
}
