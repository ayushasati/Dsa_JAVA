import java.util.*;
public class maxpairsum {
    public int maxSum(int[] nums) {
        Map<Integer, Integer> maxDigitSums = new HashMap<>();
        int maxSum = -1; // Initialize maxSum to -1

        for (int num : nums) {
            int maxDigit = getMaxDigit(num);
            if (maxDigitSums.containsKey(maxDigit)) {
                maxSum = Math.max(maxSum, maxDigitSums.get(maxDigit) + num);
                maxDigitSums.put(maxDigit, Math.max(maxDigitSums.get(maxDigit), num));
            } else {
                maxDigitSums.put(maxDigit, num);
            }
        }

        return maxSum;
    }

    public static int getMaxDigit(int num) {
        int maxDigit = 0;
        while (num > 0) {
            int digit = num % 10;
            maxDigit = Math.max(maxDigit, digit);
            num /= 10;
        }
        return maxDigit;
    }
}
