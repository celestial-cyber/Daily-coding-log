//import java.io.*;
import java.util.*;

public class solution3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            // Check if substring starts with 'b'
            if (s.charAt(i) == 'b') {

                for (int j = i + 1; j <= s.length(); j++) {
                    System.out.println(s.substring(i, j));
                    count++;
                }
            }
        }

        System.out.println("Count = " + count);
    }
}