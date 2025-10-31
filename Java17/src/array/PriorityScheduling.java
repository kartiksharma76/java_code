package array;
/**
 * Enter number of processes: 3
Enter arrival time for P1: 0
Enter burst time for P1: 10
Enter priority for P1 (lower = higher): 3
Enter arrival time for P2: 1
Enter burst time for P2: 1
Enter priority for P2 (lower = higher): 1
Enter arrival time for P3: 2
Enter burst time for P3: 2
Enter priority for P3 (lower = higher): 2

PID	Arrival	Burst	Priority	Waiting	Turnaround	Completion
P1	0	10	3		1	11		11
P2	1	1	1		0	1		2
P3	2	2	2		0	2		4

Average Waiting Time: 0.33
Average Turnaround Time: 4.67
 */
import java.util.*;

class Process {
    int pid;
    int burstTime;
    int arrivalTime;
    int priority;          // Lower number = higher priority
    int waitingTime;
    int turnaroundTime;
    int completionTime;

    public Process(int pid, int burstTime, int arrivalTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.arrivalTime = arrivalTime;
        this.priority = priority;
    }
}

public class PriorityScheduling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        List<Process> processes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter arrival time for P" + (i + 1) + ": ");
            int at = sc.nextInt();
            System.out.print("Enter burst time for P" + (i + 1) + ": ");
            int bt = sc.nextInt();
            System.out.print("Enter priority for P" + (i + 1) + " (lower = higher): ");
            int p = sc.nextInt();
            processes.add(new Process(i + 1, bt, at, p));
        }


        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));

        int currentTime = 0;
        boolean[] completed = new boolean[n];
        int completedCount = 0;

        while (completedCount < n) {
            int selected = -1;
            int highestPriority = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (!completed[i] && processes.get(i).arrivalTime <= currentTime) {
                    if (processes.get(i).priority < highestPriority ||
                        (processes.get(i).priority == highestPriority && 
                         (selected == -1 || processes.get(i).pid < processes.get(selected).pid))) {
                        highestPriority = processes.get(i).priority;
                        selected = i;
                    }
                }
            }

            if (selected == -1) {
                int nextArrival = Integer.MAX_VALUE;
                for (int i = 0; i < n; i++) {
                    if (!completed[i]) {
                        nextArrival = Math.min(nextArrival, processes.get(i).arrivalTime);
                    }
                }
                currentTime = nextArrival;
            } else {
                Process p = processes.get(selected);
                currentTime += p.burstTime;
                p.completionTime = currentTime;
                p.turnaroundTime = p.completionTime - p.arrivalTime;
                p.waitingTime = p.turnaroundTime - p.burstTime;

                completed[selected] = true;
                completedCount++;
            }
        }

        // Output
        System.out.println("\nPID\tArrival\tBurst\tPriority\tWaiting\tTurnaround\tCompletion");
        double totalWT = 0, totalTAT = 0;
        for (Process p : processes) {
            System.out.printf("P%d\t%d\t%d\t%d\t\t%d\t%d\t\t%d\n",
                p.pid, p.arrivalTime, p.burstTime, p.priority,
                p.waitingTime, p.turnaroundTime, p.completionTime);
            totalWT += p.waitingTime;
            totalTAT += p.turnaroundTime;
        }

        System.out.printf("\nAverage Waiting Time: %.2f\n", totalWT / n);
        System.out.printf("Average Turnaround Time: %.2f\n", totalTAT / n);
    }
}

