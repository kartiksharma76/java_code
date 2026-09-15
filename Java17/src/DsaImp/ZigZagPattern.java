package DsaImp;

public class ZigZagPattern {
    public String convert(String s, int numRows) {
        // Edge case: no zigzag needed
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        // Create StringBuilder array for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false; // We'll flip this at the start

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);
            
            // Change direction at top or bottom row
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            
            // Move to next row
            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }
        
        return result.toString();
    }

    // Optional: main method for testing
    public static void main(String[] args) {
        ZigZagPattern solution = new ZigZagPattern();
        System.out.println(solution.convert("PAYPALISHIRING", 3)); // PAHNAPLSIIGYIR      
    }
}