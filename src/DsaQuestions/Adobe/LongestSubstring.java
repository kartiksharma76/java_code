package DsaQuestions.Adobe;

public class LongestSubstring {
    public static int lengthOfLongestSubString(String s){
        int[] lastSeen = new int[128];

        for(int i = 0; i < lastSeen.length; i++){
            lastSeen[i] = -1;
        }
        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);

            if (lastSeen[ch] >= left){
                left = lastSeen[ch] + 1;
            }
            lastSeen[ch] = right;

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return  maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubString(s);
        System.out.println("Longest Length = " + result);
    }
}
