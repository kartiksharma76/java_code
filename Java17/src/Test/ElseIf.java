package Test;

public class ElseIf {
	public static void main(String[] args) {
		String out = "0";
		int i = -1, j = -5;
		if (i < 5)
			if (j > 0)
				if (i > j)
					out += "1";
				else
					out += "2";
			else
				out += "3";
		else
			out += "4";
		System.out.println(out);
	}

}
//out put is 03