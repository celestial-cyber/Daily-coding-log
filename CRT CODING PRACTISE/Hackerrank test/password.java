

/*
 * Problem: Password Strength Checker
 * 
 * Check if a given password string `str` of length `n` is valid.
 * Return 1 if valid, otherwise return 0.
 * 
 * Rules for a valid password:
 * 1. Minimum 4 characters in length.
 * 2. Contains at least 1 digit (0-9).
 * 3. Contains at least 1 uppercase letter (A-Z).
 * 4. Must NOT contain any spaces or slashes ('/').
 * 5. Starting character must NOT be a digit.
 * 
 * Input:
 * - A single non-empty string representing the password.
 * 
 * Constraints:
 * - 1 <= length(str) <= 100
 * 
 * Output:
 * - Print 1 if valid, 0 otherwise.
 */
import java.io.*;
import java.util.*;

public class password {

    public static int checkPassword(String str, int n) {
        // Condition 1: Password must have at least 4 characters
        if (n < 4) {
            return 0;
        }

        // Condition 5: The first character should not be a number
        if (Character.isDigit(str.charAt(0))) {
            return 0;
        }

        boolean hasDigit = false;
        boolean hasCap = false;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            // Condition 4: Should not have any spaces or slashes (/)
            if (ch == ' ' || ch == '/') {
                return 0;
            }

            // Condition 2: At least 1 digit
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            // Condition 3: At least 1 capital letter
            else if (Character.isUpperCase(ch)) {
                hasCap = true;
            }
        }

        return (hasDigit && hasCap) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String str = sc.nextLine();
            System.out.println(checkPassword(str, str.length()));
        }
        sc.close();
    }
}