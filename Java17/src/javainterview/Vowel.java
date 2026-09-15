package javainterview;

public class Vowel {
    public static void main(String[] args) {
        char ch='a';
        if("aeiouAEIOU".indexOf(ch)!=-1)
            System.out.println("Vowel");
        else System.out.println("Consonant");
    }
}