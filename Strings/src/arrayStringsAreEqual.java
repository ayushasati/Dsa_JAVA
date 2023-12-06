public class arrayStringsAreEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return concatenateArray(word1).equals(concatenateArray(word2));
    }

    private static String concatenateArray(String[] arr) {
        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }
        return result.toString();
    }

}
