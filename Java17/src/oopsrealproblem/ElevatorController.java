package oopsrealproblem;

import java.util.List;

public class ElevatorController {
private List<Elevator> elevators;

public ElevatorController(List<Elevator> elevators) {
	this.elevators = elevators;
}

public Elevator assignElevator (Request request) {
	
	Elevator bestElevator = null;
	int minDistance = Integer.MAX_VALUE;
	
	for(Elevator elevator: elevators) {
		 int distance = Math.abs(
                 elevator.getCurrentFloor() - request.getFloor());

         if (distance < minDistance) {
             minDistance = distance;
             bestElevator = elevator;
         }
	}
	 bestElevator.addRequest(request.getFloor());

     return bestElevator;
}
}
