//if even hai then on right most side to left placing ,, if odd then left most to right placing//
public class Sortparity {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {


            if (nums[left] % 2 == 0) {
                left++;
            }

            if (nums[right] % 2 == 1) {
                right--;
            }

            else{
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }

        return nums;

    }
}
