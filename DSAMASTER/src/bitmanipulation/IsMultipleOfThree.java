package bitmanipulation;

// Is Binary Number Multiple of 3 - using bitwise state machine
public class IsMultipleOfThree {
    public boolean isMultipleOf3(String binary) {
        int state = 0; // remainder tracked via states 0,1,2
        // transition table for state given bit
        int[][] trans = {{0, 1}, {2, 0}, {1, 2}};
        for (char c : binary.toCharArray()) {
            int bit = c - '0';
            state = trans[state][bit];
        }
        return state == 0;
    }
}
