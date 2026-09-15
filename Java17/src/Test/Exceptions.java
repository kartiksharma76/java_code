package Test;

public class Exceptions {
	static Integer i;
public static void main(String[] args) {
	try {
		System.out.println(i.toString());
	}catch (RuntimeException ex) {
     throw ex;
	}catch (Exception e) {
		System.out.println("e");
	}finally {
		System.out.println("fin");
	}
}
}
// fin followed by exception