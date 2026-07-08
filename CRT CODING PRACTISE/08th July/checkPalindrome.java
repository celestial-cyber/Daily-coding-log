//SESSION BY CHARY SIR 
import java.io.*;
import java.util.*;

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String email = sc.nextLine();
            
            // 1. Get the username part
            int atIndex = email.indexOf('@');
            String username = email.substring(0, atIndex);
            
            // 2. Reverse the username string
            String reversed = new StringBuilder(username).reverse().toString();
            
            // 3. Check if it's a palindrome and print the exact required output
            if (username.equals(reversed)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }
        }
        sc.close();
    }
}