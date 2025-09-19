package DsaImp;
/**
 * Input: "A man, a plan, a canal: Panama"
Output: true
Explanation:— "amanaplanacanalpanama" — 

Input: "race a car"
Output: false
Explanation: "raceacar" → "raceacar" reversed → "raceacar" — wait, actually: "rac a ecar" → no — "raceacar" vs "raceacar" — but actually:
Original cleaned: "raceacar"
Reversed:        "raceacar" — wait, let's check properly → actually → "raceacar" reversed is "raceacar"? No!

Actually:
Original: "race a car" → cleaned → "raceacar"
Reverse:  "raceacar" → reversed → "racae car" — no → actually → "raceacar".reverse() = "raceacar" — wait, let's reverse:

"raceacar" → reverse → 'r' 'a' 'c' 'e' 'a' 'c' 'a' 'r' — same? Let's write:
Original:  r a c e a c a r
Reversed:  r a c a e c a r ← Not same! → 'e' vs 'a' at position 3 vs 4

Actually — "raceacar" → index 3 = 'e', index 4 = 'a' — reversed → index 3 = 'a', index 4 = 'e' → not same.
So → "raceacar" is NOT palindrome → correct output: false 


Input: "Was it a car or a cat I saw?"
Output: true
Cleaned: "
 */
public class SentencePalindrome {
public static boolean isPalindrome(String s) {
	if(s==null)return true;
	
	int left = 0;
	int right =s.length() - 1;
	
	while (left < right) {
		while(left <right && ! Character.isLetterOrDigit(s.charAt(left))) {
			left++;
		}
		while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
			right--;
		}
		if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))) {
			return false;
		}
		left++;
		right--;
	}
	return true;
	
}
public static void main(String[] args) {
    System.out.println(isPalindrome("A man, a plan, a canal: Panama")); 
    System.out.println(isPalindrome("race a car"));                    
    System.out.println(isPalindrome("Was it a car or a cat I saw?"));   
    System.out.println(isPalindrome("Madam"));                         
    System.out.println(isPalindrome("No 'x' in Nixon"));                
    System.out.println(isPalindrome("12321"));                         
    System.out.println(isPalindrome("12345"));                          
    System.out.println(isPalindrome(""));                            
    System.out.println(isPalindrome("a"));   
}
}
