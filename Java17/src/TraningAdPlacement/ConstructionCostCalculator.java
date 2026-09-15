package TraningAdPlacement;

import java.util.Scanner;

class ConstructionCostCalculator {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);       
	// taken input from user
	
	System.out.println("Taken total area in square from user:");
	double totalArea =sc.nextDouble();
	System.out.println("Taken total construction cost per square foot:");
	double costPerSqft = sc.nextDouble();
	
   
    // total construction cost  
	
	double totalcostn= totalArea * costPerSqft;
	
	System.out.println("\n" + "=".repeat(40));
	System.out.println("  construction estimate cost :");
	
};
}
