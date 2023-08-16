public class maxones {
    public static int maxOnes(int a[], int n) {
        int maxCount = 0;  // Maximum count of ones
        int currentCount = 0;  // Current count of ones

        // Step 2: Calculate maxCount (maximum consecutive ones without flips)
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        int leftCount = 0;
        int rightCount = 0;

        // Step 4 and 5: Calculate leftCount and rightCount for each element
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                leftCount++;
            } else {
                leftCount = 0;
            }

            int j = n - 1 - i;
            if (a[j] == 1) {
                rightCount++;
            } else {
                rightCount = 0;
            }

            // Step 6: Calculate the maximum count of ones after flipping (i, i+1)
            if (i < n - 1) {
                maxCount = Math.max(maxCount, leftCount + rightCount + 1);
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] a = {1, 0, 1, 0, 1, 0, 0, 1, 1};
        int n = a.length;
        System.out.println(maxOnes(a, n));  // Output the result
    }
}

