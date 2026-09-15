package Java8Practice;

import java.time.LocalDate;
import java.time.Period;

public class CalculateDob {
	 public static void main(String[] args) {
	     
	        LocalDate dob = LocalDate.of(2005, 3, 30);
	        LocalDate currentDate = LocalDate.now();
	        Period period = Period.between(dob, currentDate);
	        int age = period.getYears();
	        int months = period.getMonths();
	        int days = period.getDays();
	        System.out.println("Age: " + age + " years");
	        System.out.println("Additional months: " + months + " months");
	        System.out.println("Additional days: " + days + " days");
	    }
}
