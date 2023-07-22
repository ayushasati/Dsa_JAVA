public class permutation2 {
        public boolean checkInclusion(String s1, String s2) {
            if (s1.length() > s2.length()) {
                return false;
            }

            int[] frequencyMap = new int[26];

            // Count the frequency of characters in s1
            for (char c : s1.toCharArray()) {
                frequencyMap[c - 'a']++;
            }

            int left = 0;
            int right = 0;
            int count = s1.length();

            while (right < s2.length()) {
                char rightChar = s2.charAt(right);
                if (frequencyMap[rightChar - 'a'] > 0) {
                    count--;
                }
                frequencyMap[rightChar - 'a']--;
                right++;

                while (count == 0) {
                    if (right - left == s1.length()) {
                        return true;
                    }

                    char leftChar = s2.charAt(left);
                    frequencyMap[leftChar - 'a']++;
                    if (frequencyMap[leftChar - 'a'] > 0) {
                        count++;
                    }
                    left++;
                }
            }

            return false;
        }

        public static void main(String[] args) {
            permutation2 solution = new permutation2();
            String s1 = "ab";
            String s2 = "eidbaooo";

            if (solution.checkInclusion(s1, s2)) {
                System.out.println("s2 contains a permutation of s1.");
            } else {
                System.out.println("s2 does not contain a permutation of s1.");
            }
        }
    }

//    Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
//
//        In other words, return true if one of s1's permutations is the substring of s2.
//
//
//
//        Example 1:
//
//        Input: s1 = "ab", s2 = "eidbaooo"
//        Output: true
//        Explanation: s2 contains one permutation of s1 ("ba").
//        Example 2:
//
//        Input: s1 = "ab", s2 = "eidboaoo"
//        Output: false
