public class largestGoodInteger {
    class Solution {
        public String largestGoodInteger(String num) {
            int n = num.length();
            String result = "";

            for (int i = 0; i <= n - 3; i++) {
                String current = num.substring(i, i + 3);

                if (isGoodInteger(current) && current.compareTo(result) > 0) {
                    result = current;
                }
            }

            return result;
        }

        private static boolean isGoodInteger(String s) {
            return s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2);
        }
    }
}
