public class Nonrepeating {
    public int[] singleNumber(int[] nums)
    {
        int xorResult = 0;
        for (int num : nums) {
            xorResult ^= num;
        }

        // Find the rightmost set bit in the XOR result
        int rightmostSetBit = 1;
        while ((rightmostSetBit & xorResult) == 0) {
            rightmostSetBit <<= 1;
        }

        int num1 = 0;
        int num2 = 0;

        for (int num : nums) {
            if ((num & rightmostSetBit) != 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        return new int[]{Math.min(num1, num2), Math.max(num1, num2)};

    }
}
