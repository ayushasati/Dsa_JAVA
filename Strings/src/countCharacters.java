import java.util.HashMap;
import java.util.Map;

public class countCharacters {

    public static int countCharacters(String[] words, String chars) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Populate the charCount map with the characters in chars
        for (char c : chars.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int result = 0;
        for (String word : words) {
            Map<Character, Integer> wordCharCount = new HashMap<>(charCount);
            if (canFormWord(word, wordCharCount)) {
                result += word.length();
            }
        }

        return result;
    }

    private static boolean canFormWord(String word, Map<Character, Integer> charCount) {
        for (char c : word.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) <= 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }
        return true;
    }
}
