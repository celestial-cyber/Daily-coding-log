import java.io.*;
import java.util.*;

public class Solution {

    // Rule 2 check
    public static boolean repeatedPattern(String s) {

        int n = s.length();

        for(int len = 1; len <= n / 2; len++) {

            if(n % len == 0) {

                String part = s.substring(0, len);

                StringBuilder sb = new StringBuilder();

                int times = n / len;

                for(int i = 0; i < times; i++) {
                    sb.append(part);
                }

                if(sb.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int n = s.length();

        boolean fraud = false;

        // Rule 1: 3 consecutive repeating characters
        for(int i = 0; i < n - 2; i++) {

            if(s.charAt(i) == s.charAt(i + 1) &&
               s.charAt(i) == s.charAt(i + 2)) {

                fraud = true;
                break;
            }
        }

        // Rule 2: repeating pattern
        if(repeatedPattern(s)) {
            fraud = true;
        }

        // Rule 3: digits > alphabets
        int digits = 0;
        int alphabets = 0;

        for(int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if(Character.isDigit(ch)) {
                digits++;
            }
            else if(Character.isLetter(ch)) {
                alphabets++;
            }
        }

        if(digits > alphabets) {
            fraud = true;
        }

        // Rule 4: first 3 == last 3
        if(n >= 6) {

            String first = s.substring(0, 3);
            String last = s.substring(n - 3);

            if(first.equals(last)) {
                fraud = true;
            }
        }

        if(fraud) {
            System.out.println("FRAUD");
        }
        else {
            System.out.println("VALID");
        }
    }
}