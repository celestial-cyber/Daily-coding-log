
import java.util.*;
public class solution1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int i, j;
        int count = 0;

        for (i = 0; i <= s.length(); i++) {
            for (j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i , j));
                count++;
            }
        }

        System.out.println("Total Substrings = " + count);
    }
}