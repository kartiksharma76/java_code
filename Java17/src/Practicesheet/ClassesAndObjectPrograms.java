package Practicesheet;
/**
 *  Classes and Object Programs
1. Java Program to Create a Class and Object
2. Java Program to Create an Interface
3. Java Program to Show Inheritance in Class
4. Java Program to Show Data Hiding in Class
5. Java Program to Show Polymorphism in Class
6. Java Program to Show Overloading of Methods in Class
7. Java Program to Show Overriding of Methods in Classes
8. Java Program to Show Use of Super Keyword in Class
9. Java Program to Show Use of This Keyword in Class
10. Java Program to Show Usage of Static keyword in Class
 */
//SINGLE PAGE JAVA PROGRAM – OOPS CONCEPTS

interface Animal {                      // Interface
 void sound();
}

class Parent {                          // Parent class
 int x = 10;

 void show() {
     System.out.println("Parent method");
 }
}

class Child extends Parent implements Animal {   // Inheritance + Interface
 int x = 20;

 // Overriding
 void show() {
     System.out.println("Child method");
 }

 // Interface method
 public void sound() {
     System.out.println("Animal sound");
 }

 // Method Overloading
 void add(int a, int b) {
     System.out.println("Sum: " + (a + b));
 }

 void add(int a, int b, int c) {
     System.out.println("Sum: " + (a + b + c));
 }

 // super keyword
 void useSuper() {
     System.out.println("Parent variable: " + super.x);
 }
}

class Account {                         // Data Hiding
 private int balance = 5000;

 int getBalance() {
     return balance;
 }
}

public class ClassesAndObjectPrograms {

 static int count = 0;               // static keyword

 ClassesAndObjectPrograms() {
     count++;
 }

 int id;                             // this keyword
 ClassesAndObjectPrograms(int id) {
     this.id = id;
 }

 public static void main(String[] args) {

     // 1. Class & Object
     ClassesAndObjectPrograms obj = new ClassesAndObjectPrograms(101);
     System.out.println("Object ID: " + obj.id);

     // 2–3. Interface + Inheritance
     Child c = new Child();
     c.sound();

     // 4. Data Hiding
     Account acc = new Account();
     System.out.println("Balance: " + acc.getBalance());

     // 5. Polymorphism
     Parent p = new Child();
     p.show();

     // 6. Method Overloading
     c.add(10, 20);
     c.add(10, 20, 30);

     // 7. Method Overriding
     c.show();

     // 8. super keyword
     c.useSuper();

     // 9. this keyword
     System.out.println("This keyword ID: " + obj.id);

     // 10. static keyword
     new ClassesAndObjectPrograms();
     new ClassesAndObjectPrograms();
     System.out.println("Static Count: " + count);
 }
}
