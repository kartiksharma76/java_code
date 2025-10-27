package TraningAdPlacement;

import java.util.Scanner;

/**
 * public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter operator (+, -, *, /):");
        String op = sc.next();

        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();

        double result = performResult(num1, op, num2);
        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }

        sc.close();
    }

 */
public class RealTimeDataType {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	 System.out.print("Enter cost per sqft: ");
     double costPerSqft = sc.nextDouble();
//	int costsqft= 1050;
     System.out.print("Enter total sqft: ");
     double totalSqft = sc.nextDouble();
	//double totalsqft= 230.17;
     
     double totalCost = costPerSqft * totalSqft;

	
	char currency ='$';
	
	System.out.println("\nProperty Cost ");
    System.out.println("Cost per sqft: " + costPerSqft + currency);
    System.out.println("Total sqft: " + totalSqft);
    System.out.println("Total cost: " + totalCost + currency);
 
    
    System.out.printf("Total cost (formatted): %.2f%c%n", totalCost, currency);
	}
}