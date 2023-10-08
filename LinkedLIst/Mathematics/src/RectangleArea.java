import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        Scanner s = new Scanner(System.in);
        x1 = s.nextInt();
        y1 = s.nextInt();
        x2 = s.nextInt();
        y2 = s.nextInt();
        System.out.println((x2 - x1) * (y2 - y1));
    }
}