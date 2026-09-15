package InfosysSpringboard;

class Validation {
    public static void main(String[] args) {
        int heads = 150;
        int legs = 500;
        
        solve(heads, legs);
    }

    public static void solve(int heads, int legs) {
        int rabbits = (legs - 2 * heads) / 2;
        int chickens = heads - rabbits;

        // Validation: 
        // 1. Rabbits and chickens must be non-negative.
        // 2. Legs must be even (since animals have an even number of legs).
        // 3. The total legs must match exactly (checks for fractional results).
        if (rabbits >= 0 && chickens >= 0 && legs % 2 == 0 && (chickens * 2 + rabbits * 4 == legs)) {
            System.out.println("Chickens=" + chickens);
            System.out.println("Rabbits=" + rabbits);
        } else {
            System.out.println("The number of chickens and rabbits cannot be found");
        }
    }
}
