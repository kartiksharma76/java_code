package Enum;

enum TrafficSignal {
	RED, YELLOW, GREEN
}

public class Traffic {
	public static void main(String[] args) {
		TrafficSignal signal = TrafficSignal.RED;

		switch (signal) {
		case RED:
			System.out.println("STOP");
			break;

		case YELLOW:
			System.out.println("WAIT");
			break;

		case GREEN:
			System.out.println("GO");
			break;
		}
	}
}
