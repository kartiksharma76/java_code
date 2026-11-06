package DsaQuestions.Hardestproblem;

public class WaterBottle {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange;
            int remBottles = numBottles % numExchange;

            ans = ans + newBottles;
            numBottles = newBottles + remBottles;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(numWaterBottles(15, 4));
    }

}