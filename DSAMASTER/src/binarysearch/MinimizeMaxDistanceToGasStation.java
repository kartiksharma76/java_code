package binarysearch;

public class MinimizeMaxDistanceToGasStation {

    static int stationsRequired(int[] arr, double dist) {
        int count = 0;

        for (int i = 1; i < arr.length; i++) {

            double gap = arr[i] - arr[i - 1];

            int required = (int)(gap / dist);

            if (Math.abs(required * dist - gap) < 1e-6)
                required--;

            count += required;
        }

        return count;
    }

    public static void main(String[] args) {

        int[] stations = {1, 2, 3, 4, 5, 10};
        int k = 2;

        double low = 0;
        double high = 5;

        while (high - low > 1e-6) {

            double mid = (low + high) / 2;

            if (stationsRequired(stations, mid) > k)
                low = mid;
            else
                high = mid;
        }

        System.out.printf("%.6f", high);
    }
}