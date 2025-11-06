package array;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Generics.Y;

public class WhizLab {
public static void main(String[] args) {
LocalDate id = LocalDate.of(2015, 2, 27).plusDays(3);
System.out.println(id.getMonth());
//	Period p = Period.ofMonths(13);
//	System.out.println(p.normalized());
//	String s= "Whiz";
//	s.concat("Lab");
//	s.toLowerCase();
//	System.out.print(s);
	
//	StringBuilder sb = new StringBuilder("Whizlab");
//	char[] ch = new char[4];
//	sb.getChars(1, 5, ch, 1);
//	for(char c : ch )System.out.print(c);
//	
//	long l = 1;
//	int i =0;
//	StringBuilder sb = new StringBuilder("10");
//	sb.insert(i, 1);
//	System.out.println(sb.toString());
	
//	StringBuilder sb = new StringBuilder("Whizlab");
//	int x= sb.capacity();
//	int y =sb.capacity();
//	System.out.println(x);
//	String s= String.join("-", "1","1");
//	System.out.println(s);
	
//	LocalDate date = LocalDate.of(2015, 12, 12);
//	LocalTime time = date.atTime(10,22);
//	Year y = Year.of(2015);
//	LocalDate date = y.atMonthDay(MonthDay.of(4, 31));
//	System.out.println(date);
	
//	ArrayList<String> alist = new ArrayList<String>();
//	alist.add("A");
//	alist.add("B");
//	alist.add("A");
//	alist.add("C");
//	alist.add("B");
//	System.out.println(alist);
//	Collections.sort(alist);
//	System.out.println(alist);
//	List lst = new ArrayList(1);
//	lst.add(1);
//	lst.add("A");
//	lst.add(new Integer(5));
//	System.out.println(lst);
	
//	LocalTime it = LocalTime.of(12, 30);
//	LocalDate id = LocalDate.of(2015, 2, 21);
//	LocalDateTime idt = it.atDate(id);
//	idt.minusYears(2);
//	idt.minusDays(2);
//	System.out.println(idt.getYear() + "/"+ idt.getMonthValue()+"/"+idt.getDayOfWeek());
	
//	List<String> list = new ArrayList<String>();
//	list.add("A");
//	
//	list.add("C");
//
//	list.add("E");
//
//	list.add("D");
//
//	list.add(1,"B");
//
//	list.add(4,"");
//	System.out.println(list);
//	Period p1 = Period.ofYears(1);
//	Period p2 = Period.of(0, 1, 0);
//	Period p3 = p1.plus(p2);
//	System.out.println(p3.getDays());
//	
//LocalDate idt = LocalDate.of(2000, 3, 1);
//DateTimeFormatter format =DateTimeFormatter.ofPattern("dd/M/yyyy");
//System.out.println(idt.format(format));
//	LocalDate id = LocalDate.of(2015, 12, 12);
//	id = id.with(ChronoField.DAY_OF_YEAR,30);
//	System.out.println(id);
//	LocalTime it = LocalTime.of(2, 2,15);
//	System.out.println(it.getLong(ChronoField.valueOf("MINUTE_OF_DAY")));
//	
	
//	List<String> list = new ArrayList<String>();
//	list.add("1");
//	list.add("2");
//	list.add("3");
//	
//	list.add("4");
//	
//	System.out.println(list.set(3,"3"));
	
//	String s1 = "Whizlab";
//	s1.substring(1,4);
//	System.out.println(s1.charAt(3));
	
//	StringBuilder sb = new StringBuilder("ab");
////	sb.append(new char[] {'l','a','b'},0,2);
////	System.out.println(sb);
//	sb.append("cd");
//	String str = new String(sb);
//	str.concat("ef");
//	System.out.println(str);
//	LocalDate id = LocalDate.ofYearDay(2016, 22);
//	System.out.println(id.getMonthValue());
	
//	StringBuilder sb = new StringBuilder("Whiz");
//	sb.delete(2, 5);
//	System.out.println(sb);
//	List<String> l= new ArrayList<?>();
;}
}
