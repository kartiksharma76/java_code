package ArrayQuestion;

import java.util.*;

// Keep the class name as Process2
class Process2 {
    int id;
    int burstTime;
    int arrivalTime;
    int remainingTime;
    int completionTime;
    int waitingTime;
    int turnaroundTime;

    Process2(int id, int burstTime, int arrivalTime) {
        this.id = id;
        this.burstTime = burstTime;
        this.arrivalTime = arrivalTime;
        this.remainingTime = burstTime;
    }
}

public class SRTFScheduling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();
        
        // Use Process2[] instead of Process[]
        Process2[] processes = new Process2[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter burst time for P" + (i + 1) + ": ");
            int bt = sc.nextInt();
            System.out.print("Enter arrival time for P" + (i + 1) + ": ");
            int at = sc.nextInt();
            processes[i] = new Process2(i + 1, bt, at); // Instantiate Process2
        }
        
        srtfScheduling(processes);
        printResults(processes);
    }

    // Accept Process2[] array
    public static void srtfScheduling(Process2[] processes) {
        int n = processes.length;
        boolean[] completed = new boolean[n];
        int currentTime = 0;
        int completedCount = 0;
        
        while (completedCount < n) {
            int minIndex = -1;
            int minRemainingTime = Integer.MAX_VALUE;
            
            for (int i = 0; i < n; i++) {
                if (!completed[i] && 
                    processes[i].arrivalTime <= currentTime && 
                    processes[i].remainingTime < minRemainingTime) { // ✅ Fixed missing field
                    minRemainingTime = processes[i].remainingTime;
                    minIndex = i;
                }
            }
            
            if (minIndex == -1) {
                currentTime++; // CPU idle
            } else {
                processes[minIndex].remainingTime--;
                currentTime++;
                
                if (processes[minIndex].remainingTime == 0) {
                    completed[minIndex] = true;
                    completedCount++;
                    processes[minIndex].completionTime = currentTime;
                    processes[minIndex].turnaroundTime = 
                        processes[minIndex].completionTime - processes[minIndex].arrivalTime;
                    processes[minIndex].waitingTime = 
                        processes[minIndex].turnaroundTime - processes[minIndex].burstTime;
                }
            }
        }
    }

    // Print results for Process2[]
    public static void printResults(Process2[] processes) {
        System.out.println("\nProcess\tArrival\tBurst\tCompletion\tWaiting\tTurnaround");
        double totalWaitingTime = 0;
        double totalTurnaroundTime = 0;
        
        for (Process2 p : processes) {
            System.out.printf("P%d\t%d\t%d\t%d\t\t%d\t%d\n", 
                p.id, p.arrivalTime, p.burstTime, 
                p.completionTime, p.waitingTime, p.turnaroundTime);
            totalWaitingTime += p.waitingTime;
            totalTurnaroundTime += p.turnaroundTime;
        }
        
        System.out.printf("\nAverage Waiting Time: %.2f\n", totalWaitingTime / processes.length);
        System.out.printf("Average Turnaround Time: %.2f\n", totalTurnaroundTime / processes.length);
    }
}