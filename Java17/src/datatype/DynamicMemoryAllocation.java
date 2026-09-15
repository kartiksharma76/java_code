package datatype;

import java.util.Scanner;

public class DynamicMemoryAllocation {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number element:");
	int size =scanner.nextInt();
	int[]numbers=new int [size];
	System.out.println("enter the eements:");
	for(int i=0; i<size; i++) {
		numbers[i]=scanner.nextInt();
		
	}
	int sum=0;
	for(int number:numbers) {
		sum+=number;
		 System.out.println("Sum of elements: " + sum);

	        // Analyze advantages of dynamic memory allocation
	        System.out.println("\nAdvantages of Dynamic Memory Allocation:");
	        System.out.println("- Flexibility: Memory is allocated during runtime, allowing for efficient memory usage.");
	        System.out.println("- Efficiency: Avoids memory wastage by allocating only the necessary amount of memory.");
	        System.out.println("- Reusability: Memory can be deallocated and reused as needed.");
	        System.out.println("- Efficiency: Improves performance by reducing memory fragmentation.");

	        scanner.close();
	}
}
}
