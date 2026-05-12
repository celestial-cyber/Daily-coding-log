import java.util.*;

public class solution4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'b') {

                for (int j = i + 1; j <= s.length(); j++) {

                    String sub = s.substring(i, j);

                    if (sub.charAt(sub.length() - 1) == '3') {
                        System.out.println(sub);
                        count++;
                    }
                }
            }
        }

        System.out.println("Count = " + count);
    }
}