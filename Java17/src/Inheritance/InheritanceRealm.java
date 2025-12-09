package Inheritance;
//Root Class
class Entity {
 String tag;

 Entity(String tag) {
     this.tag = tag;
     System.out.println("Entity constructor: " + tag);
 }

 void exist() {
     System.out.println(tag + " is existing...");
 }
}

//Single Inheritance
class Creature extends Entity {

 Creature(String tag) {
     super(tag);
     System.out.println("Creature constructor: " + tag);
 }

 void consume() {
     System.out.println(tag + " is consuming resources...");
 }
}

//Multi-Level Inheritance
class Terrestrial extends Creature {

 Terrestrial(String tag) {
     super(tag);
     System.out.println("Terrestrial constructor: " + tag);
 }

 void walk() {
     System.out.println(tag + " is walking on land...");
 }
}

class Person extends Terrestrial {

 Person(String tag) {
     super(tag);
     System.out.println("Person constructor: " + tag);
 }

 void communicate() {
     System.out.println(tag + " is communicating...");
 }

 @Override
 void exist() {
     System.out.println(tag + " is existing as a human...");
 }
}

//Hierarchical Inheritance
class Aviator extends Creature {

 Aviator(String tag) {
     super(tag);
     System.out.println("Aviator constructor: " + tag);
 }

 void glide() {
     System.out.println(tag + " is gliding in the air...");
 }
}

class Aquatic extends Creature {

 Aquatic(String tag) {
     super(tag);
     System.out.println("Aquatic constructor: " + tag);
 }

 void dive() {
     System.out.println(tag + " is diving underwater...");
 }
}

//Another branch
class Crawler extends Creature {

 Crawler(String tag) {
     super(tag);
     System.out.println("Crawler constructor: " + tag);
 }

 void creep() {
     System.out.println(tag + " is creeping slowly...");
 }
}


//MAIN CLASS
public class InheritanceRealm {
 public static void main(String[] args) {

     System.out.println("\n--- Person Object ---");
     Person p = new Person("Aarav");
     p.exist();
     p.consume();
     p.walk();
     p.communicate();

     System.out.println("\n--- Aviator Object ---");
     Aviator a = new Aviator("Falcon");
     a.exist();
     a.consume();
     a.glide();

     System.out.println("\n--- Aquatic Object ---");
     Aquatic aq = new Aquatic("BlueWhale");
     aq.exist();
     aq.consume();
     aq.dive();

     System.out.println("\n--- Crawler Object ---");
     Crawler c = new Crawler("PythonSnake");
     c.exist();
     c.consume();
     c.creep();
 }
}

