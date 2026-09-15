package InfosysSpringboard;

class UpperLimit {
    public static void main(String[] args) {
        // Upper limit for the number of rows
        int rows = 4; 
        
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}