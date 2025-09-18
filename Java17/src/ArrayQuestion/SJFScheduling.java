package ArrayQuestion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Process {
	int pid;
	int burstTime;
	int arrivalTime;
	int waitingTime;
	int turnAroundTime;

	public Process(int pid, int burstTime, int arrivalTime) {
		super();
		this.pid = pid;
		this.burstTime = burstTime;
		this.arrivalTime = arrivalTime;

	}

}

public class SJFScheduling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of process:");
		int n = sc.nextInt();

		List<Process> processes = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter arrival time for process " + (i + 1) + ": ");
			int at = sc.nextInt();
			System.out.print("Enter burst time for process " + (i + 1) + ": ");
			int bt = sc.nextInt();
			processes.add(new Process(i + 1, bt, at));
		}
		processes.sort(Comparator.comparing(p -> p.arrivalTime));
		int currentTime = 0;
		boolean[] completed = new boolean[n];

		int completedCount = 0;
		int[] completionTime = new int[n];

		while (completedCount < n) {
			int shortestIndex = -1;
			int shortestBurst = Integer.MAX_VALUE;

			for (int i = 0; i < n; i++) {
				if (!completed[i] && processes.get(i).arrivalTime <= currentTime) {
					if (processes.get(i).burstTime < shortestBurst) {
						shortestBurst = processes.get(i).burstTime;
						shortestIndex = i;
					}
				}
			}

			if (shortestIndex == -1) {
				currentTime++;
				continue;
			}

			Process p = processes.get(shortestIndex);
			currentTime += p.burstTime;
			completionTime[shortestIndex] = currentTime;
			p.turnAroundTime = completionTime[shortestIndex] - p.arrivalTime;
			p.waitingTime = p.turnAroundTime - p.burstTime;

			completed[shortestIndex] = true;
			completedCount++;
		}

		System.out.println("\nPID\tArrival\tBurst\tWaiting\tTurnaround\tCompletion");
		for (Process p : processes) {
			System.out.println(p.pid + "\t" + p.arrivalTime + "\t" + p.burstTime + "\t" + p.waitingTime + "\t"
					+ p.turnAroundTime + "\t\t" + (p.waitingTime + p.burstTime));
		}
		double avgWaitingTime = processes.stream().mapToInt(p -> p.waitingTime).average().orElse(0.0);
		double avgTurnAroundTime = processes.stream().mapToInt(p -> p.turnAroundTime).average().orElse(0.0);

		System.out.printf("\nAverage Waiting Time: %.2f\n", avgWaitingTime);
		System.out.printf("Average Turnaround Time: %.2f\n", avgTurnAroundTime);
	}
}
