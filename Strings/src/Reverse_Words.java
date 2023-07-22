import java.util.Scanner;
public class Reverse_Words {
    public static String reverseWords(String S) {
        String out = "";
        String temp = "";
        for (int i = S.length() - 1; i >= 0; i--) {
            temp += S.charAt(i);
            if (S.charAt(i) == '.') {
                out = temp + out;
                temp = "";
            }
        }
        // Append the last word to the output.
        out = temp + out;
        return out;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(Reverse_Words.reverseWords(input));
    }
}
