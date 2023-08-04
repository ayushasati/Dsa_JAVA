import java.util.*;
public class Lettercombinaltion {
    public List<String> letterCombinations(String digits) {
        List <String> result = new ArrayList<>();
        if (digits == null || digits.length()==0){
            return result;
        }

        String[] keypadMapping={
                "",     // 0
                "",     // 1
                "abc",  // 2
                "def",  // 3
                "ghi",  // 4
                "jkl",  // 5
                "mno",  // 6
                "pqrs", // 7
                "tuv",  // 8
                "wxyz"  // 9

        };
        letterCombinations(result, digits, "", 0, keypadMapping);
        return result;
    }

    private static void letterCombinations(List<String> result, String digits, String current, int index, String[] keypadMapping) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        char digit = digits.charAt(index);
        String letters = keypadMapping[digit - '0'];
        for (char letter : letters.toCharArray()) {
            letterCombinations(result, digits, current + letter, index + 1, keypadMapping);
        }
    }
}
