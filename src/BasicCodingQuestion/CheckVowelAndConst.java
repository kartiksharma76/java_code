package BasicCodingQuestion;

public class CheckVowelAndConst {
    public static void main(String[] args) {
        char ch = 'E';
        char c = Character.toLowerCase(ch);

        if(c >= 'a' && c <= 'z'){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                System.out.println("Vowel");
            }else
                System.out.println("Consonant");
            }

        }

    }

