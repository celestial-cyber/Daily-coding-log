import java.util.*;

public class solution2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.length() == 0) {
            System.out.println("String is Empty");
            return;
        }

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 3; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No substring length > 2");
        }

        System.out.println("Count = " + count);
    }
}