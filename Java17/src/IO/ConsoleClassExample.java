package IO;

import java.security.Permission;
import java.util.Scanner;

/**
 * Please complete the partially completed code in the editor. If your code
 * successfully converts into a string the code will print "Good job". Otherwise
 * it will print "Wrong answer". can range between -100 to100 inclusive.
 */
public class ConsoleClassExample {
//	public static void main(String[] args) {
//
//		DoNotTerminate.forbidExit();
//
//		try {
//			Scanner in = new Scanner(System.in);
//			int n = in.nextInt();
//			in.close();
//			// String s=???; Complete this line below
//			String s = Integer.toString(n);
//
//			// Write your code here
//
//			if (n == Integer.parseInt(s)) {
//				System.out.println("Good job");
//			} else {
//				System.out.println("Wrong answer.");
//			}
//		} catch (DoNotTerminate.ExitTrappedException e) {
//			System.out.println("Unsuccessful Termination!!");
//		}
//	}
//}
//
//// The following class will prevent you from terminating the code using exit(0)!
//class DoNotTerminate {
//
//	public static class ExitTrappedException extends SecurityException {
//
//		private static final long serialVersionUID = 1;
//	}
//
//	public static void forbidExit() {
//		final SecurityManager securityManager = new SecurityManager() {
//			@Override
//			public void checkPermission(Permission permission) {
//				if (permission.getName().contains("exitVM")) {
//					throw new ExitTrappedException();
//				}
//			}
//		};
//		System.setSecurityManager(securityManager);
//	}
}
