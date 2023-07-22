import java.util.*;
public class twostringpermutation {
        public static boolean isPermutation(String str1, String str2) {


            if (str1.length() != str2.length()) {
                return false;
            }

            int[] frequencyArray = new int[256]; // Assuming the character set is ASCII

            // Count the occurrences of characters in str1 and store in the frequency array
            for (char c : str1.toCharArray()) {
                frequencyArray[c]++;
            }

            // Decrement the frequency for each character in str2
            for (char c : str2.toCharArray()) {
                frequencyArray[c]--;
            }

            // If all elements in the frequency array are 0, then str1 and str2 are permutations
            return Arrays.stream(frequencyArray).allMatch(count -> count == 0);
        }




    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String str1 = sr.nextLine();
        String str2 = sr.nextLine();
        boolean ans = twostringpermutation.isPermutation(str1, str2);

        System.out.println(ans);

    }
}