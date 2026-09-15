package MyInheritance;
// benefit of inheritance code reusability 
// grand father--->father--->child(unidirectional)it is also known as is a relation
// How we can represent above relation in java ?
// with the help of inheritance concept
//  son extends parent extends grandparent
public class GrandParent {
 private int money=100000;

public int getGrandParentMoney() {
	return money;
}
  
}
class Parent extends GrandParent{
private int money=50000;

public int getParentMoney() {
	//return money+super.getMoney();
	return money;
}
	
}
class Son extends Parent{
 public int getTotalMoney() {
	 //System.out.println(super.money);
	// System.out.println(super.super.money); this is invalid syntax
	 return getParentMoney()+getGrandParentMoney();//benefit of inheritance(Code reusability)
 }
	}
class Animal{
	
}
class Dog extends Animal{
	// A dog is an animal
	// Animal is a dog
	// Animal is a cow 
	
}
class Employee{
	
}
class Devloper extends Employee{
	// A developer is an employee
	//An employee is a developer
	// An employee is a HR
	// An employee is a Manager 
}