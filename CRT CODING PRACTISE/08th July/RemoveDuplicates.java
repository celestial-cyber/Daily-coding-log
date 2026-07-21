import java.io.*;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String email = sc.nextLine();
            
            int atIndex = email.indexOf('@');
            String username = email.substring(0, atIndex);
            String domain = email.substring(atIndex);
            
            StringBuilder uniqueUsername = new StringBuilder();
            
           
            for (int i = 0; i < username.length(); i++) {
                char ch = username.charAt(i);
                
                if (uniqueUsername.indexOf(String.valueOf(ch)) == -1) {
                    uniqueUsername.append(ch);
                }
            }
            
           
            System.out.println(uniqueUsername.toString() + domain);
        }
        sc.close();
    }
}