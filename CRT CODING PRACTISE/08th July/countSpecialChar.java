import java.io.*;
import java.util.*;

public class countSpecialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String email = sc.nextLine();
            
            // 1. Find the split point and isolate the username
            int atIndex = email.indexOf('@');
            String username = email.substring(0, atIndex);
            
            int specialCharCount = 0;
            
            // 2. Loop through the username to count special characters
            for (int i = 0; i < username.length(); i++) {
                char ch = username.charAt(i);
                
                // If it's not a letter and not a digit, it's a special character
                if (!Character.isLetter(ch) && !Character.isDigit(ch)) {
                    specialCharCount++;
                }
            }
            
            // 3. Print the final count
            System.out.println(specialCharCount);
        }
        sc.close();
    }
}