import java.io.*;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String email = sc.nextLine();
            
            // 1. Separate username and domain
            int atIndex = email.indexOf('@');
            String username = email.substring(0, atIndex);
            String domain = email.substring(atIndex);
            
            StringBuilder uniqueUsername = new StringBuilder();
            
            // 2. Loop through username and keep only the first occurrence
            for (int i = 0; i < username.length(); i++) {
                char ch = username.charAt(i);
                
                // If the character is not already in our new string, add it
                if (uniqueUsername.indexOf(String.valueOf(ch)) == -1) {
                    uniqueUsername.append(ch);
                }
            }
            
            // 3. Print the modified username combined with the original domain
            System.out.println(uniqueUsername.toString() + domain);
        }
        sc.close();
    }
}