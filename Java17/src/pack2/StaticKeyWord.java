package pack2;

public class StaticKeyWord {
	static int count=0;
	public StaticKeyWord() {
		count++;
	}
	public static void main(String[] args) {
		StaticKeyWord obj1=new StaticKeyWord();
		StaticKeyWord obj2=new StaticKeyWord();
		StaticKeyWord obj3=new StaticKeyWord();
		StaticKeyWord obj4=new StaticKeyWord();
		System.out.println(count);
	}

}
