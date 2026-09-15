package queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * For every character appended to the stream, reports the first character
 * seen so far that has not (yet) repeated — or '#' if none qualifies.
 * A queue holds candidate characters in arrival order; a frequency count
 * lets us evict characters from the front once they've repeated.
 */
public class FirstNonRepeatingCharacterInStream {

    public static String firstNonRepeating(String stream) {
        int[] freq = new int[256];
        Deque<Character> candidates = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();

        for (char c : stream.toCharArray()) {
            freq[c]++;
            candidates.offer(c);

            while (!candidates.isEmpty() && freq[candidates.peek()] > 1) {
                candidates.poll();
            }

            result.append(candidates.isEmpty() ? '#' : candidates.peek());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String stream = "aabcdb";
        System.out.println("Stream:  " + stream);
        System.out.println("Answer:  " + firstNonRepeating(stream));
        // a -> a, a -> #, b -> b, c -> b, d -> b, b -> d
    }
}
