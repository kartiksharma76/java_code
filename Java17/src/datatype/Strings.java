package datatype;

public class Strings {
	public static void main(String[] args) {
		// concatenation
		String firstname = "kartikey";
		String lastname = "sharma";
		String fullname = firstname + " @ " + lastname;

		System.out.println(fullname);
		System.out.println(fullname.length());
		// charAt
		for(int i=0; i<fullname.length();i++) {
			System.out.println(fullname.charAt(i));
		}
	}

}
