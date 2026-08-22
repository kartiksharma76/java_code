package array;

class Message {
    public static void main(String[] args) {
        System.out.println("Welcome " + args[2] + "!");
    }
}

public class Guest {
    public static void main(String[] args) {
        String[] arguments = {"Hello", "Rahul", "Sharma"};
        Message.main(arguments);
       
    }
}