import java.util.*;

public class Solution {

    public static List<Integer> maxSubarray(List<Integer> arr) {
        int maxSubarray = arr.get(0);
        int currentSum = arr.get(0);

        int maxElement = arr.get(0);
        int subsequenceSum = 0;
        boolean hasPositive = false;

        for (int i = 1; i < arr.size(); i++) {

            // Maximum subarray (Kadane's Algorithm)
            currentSum = Math.max(arr.get(i), currentSum + arr.get(i));
            maxSubarray = Math.max(maxSubarray, currentSum);

            // Maximum subsequence
            if (arr.get(i) > 0) {
                subsequenceSum += arr.get(i);
                hasPositive = true;
            }

            maxElement = Math.max(maxElement, arr.get(i));
        }

        // Include first element for subsequence calculation
        if (arr.get(0) > 0) {
            subsequenceSum += arr.get(0);
            hasPositive = true;
        }

        if (!hasPositive) {
            subsequenceSum = maxElement;
        }

        return Arrays.asList(maxSubarray, subsequenceSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }

            List<Integer> result = maxSubarray(arr);

            System.out.println(result.get(0) + " " + result.get(1));
        }

        sc.close();
    }
}