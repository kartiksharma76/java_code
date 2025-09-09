package ArrayQuestion;

import java.util.Scanner;

public class FcfsSheduling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of processes: ");
		int n = sc.nextInt();
		int[] pno = new int[n];
		int[] at = new int[n];
		int[] bt = new int[n];
		int[] ct = new int[n];
		int[] tat = new int[n];
		int[] wt = new int[n];
 
		for (int i = 0; i < n; i++) {
			System.out.println("\nprocess " + (i + 1) + " ");
			pno[i] = i + 1;
			System.out.print("Enter Arrival Time: ");
			at[i] = sc.nextInt();
			System.out.print("Enter Burst Time: ");
			bt[i] = sc.nextInt();

		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
// arival ke liya
				if (at[j] > at[j + 1]) {
					int temp = at[j];
					at[j] = at[j + 1];
					at[j + 1] = temp;

					// brust time
					temp = bt[j];
					bt[j] = bt[j + 1];
					bt[j + 1] = temp;
// starting
					temp = pno[j];
					pno[j] = pno[j + 1];
					pno[j + 1] = temp;

				}
			}
		}
		
		//for ct
		ct[0] = at[0] + bt[0]; 
        for (int i = 1; i < n; i++) {
            if (at[i] > ct[i - 1]) {
                ct[i] = at[i] + bt[i];
            } else {
                ct[i] = ct[i - 1] + bt[i];  
            }
        }
		// for tatat
		for(int i=0;i<n;i++) {
			tat[i]= ct[i]-at[i];
			wt[i]= tat[i]-bt[i];
		}
		
		float totalTAT=  0;
		float totalWT=0;
		
		for(int i=0;i<n;i++) {
			System.out.printf("| %2d | %12d | %10d | %15d | %14d | %12d |\n",
                    pno[i], at[i], bt[i], ct[i], tat[i], wt[i]);
			totalTAT += tat[i];
            totalWT += wt[i];
            
            
            System.out.printf("\nAverage Turnaround Time: %.2f\n", totalTAT / n);
            System.out.printf("Average Waiting Time: %.2f\n", totalWT / n);

            sc.close();
			
		}
	}
}
