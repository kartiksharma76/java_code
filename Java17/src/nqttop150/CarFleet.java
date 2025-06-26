package nqttop150;

import java.util.Arrays;

public class CarFleet {
	public static int carFlet(int target, int[] position, int[] speed) {
		int n = position.length;
		double[][] cars = new double[n][2];
		for (int i = 0; i < n; i++) {
			cars[i][0] = position[i];
			cars[i][1] = (double) (target - position[i]) / speed[i];
		}
		Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

		int fleets = 0;
		double time = 0;

		for (int i = 0; i < n; i++) {
			if (cars[i][1] > time) {
				fleets++;
				time = cars[i][1];
			}
		}
		return fleets;

	}

	public static void main(String[] args) {
		int target = 10;
		int[] position = { 1, 4 };
		int[] speed = { 3, 2 };
		System.out.println("output:" + carFlet(target, position, speed));
	}
}