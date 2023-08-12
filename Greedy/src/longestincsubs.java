public class longestincsubs {
    static int longestSubsequence(int size, int a[])
    {
        // code here

        int[] lis = new int[size];  // Initialize the LIS array
        int length = 0;  // To keep track of the LIS length

        for (int num : a) {
            int index = binarySearch(lis, 0, length, num);
            if (index < 0) {
                index = -(index + 1);
            }
            lis[index] = num;
            if (index == length) {
                length++;
            }
        }

        return length;
    }

    // Binary search to find the correct position
    private static int binarySearch(int[] arr, int left, int right, int target) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return -(left + 1);
    }


}
