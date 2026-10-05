package DsaQuestions.GoldmanSachs;

/**
 * Is This problem the best approach are greedy in here we can use two pases
 * main idea=  in every child has provided minimum one candy
 * left->right :if the current child rating has more than left neighbor so the  current  child has (left + 1)candies
 * right-> left : if the current child rating has moe than right child neighbor so the current  has max is(current, right + 1)candies
 */
public class Candy {
    public static  int candy(int [] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];

        // everyone get minimum 1 candy
        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }

        // left to right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }
        int total = 0;
        for (int c : candies) {
            total += c;
        }
        return total;

    }

    public static void main(String[] args) {
        int [] ratings = {1,0,2};
        int result = candy(ratings);
        System.out.println("Minimum candies required: "+ result);
    }
}
