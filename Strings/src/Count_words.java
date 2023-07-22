import java.util.*;
public class Count_words {
    public class Solution {

        public static int countWords(String str) {
            if (str == null || str.isEmpty()) {
                return 0;
            }

            String[] words = str.split("\\s+");
            return words.length;
        }
    }
}
