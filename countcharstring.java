import java.util.*;
public class countcharstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string: ");
        String str = scanner.nextLine();
        int[] counts = new int[100];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            counts[ch]++;
        }
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println((char) i + ": " + counts[i]);
            }
        }
    }
}