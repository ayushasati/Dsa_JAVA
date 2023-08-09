public class Searchrortatedarray {
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    return mid; // Return the index if target is found
                }

                // If the left half is sorted
                if (nums[left] <= nums[mid]) {
                    if (nums[left] <= target && target < nums[mid]) {
                        right = mid - 1; // Move the right pointer to the left half
                    } else {
                        left = mid + 1; // Move the left pointer to the right half
                    }
                }
                // If the right half is sorted
                else {
                    if (nums[mid] < target && target <= nums[right]) {
                        left = mid + 1; // Move the left pointer to the right half
                    } else {
                        right = mid - 1; // Move the right pointer to the left half
                    }
                }
            }

            return -1; // Return -1 if target is not found
        }
    }


