import java.io.*;
import java.util.*;

public class toggleDomain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String email = sc.nextLine();
            
            
            int atIndex = email.indexOf('@');
            String username = email.substring(0, atIndex);
            String domain = email.substring(atIndex); 
            
            StringBuilder toggledDomain = new StringBuilder();
            
            
            for (int i = 0; i < domain.length(); i++) {
                char ch = domain.charAt(i);
                
                if (Character.isUpperCase(ch)) {
                    toggledDomain.append(Character.toLowerCase(ch));
                } else if (Character.isLowerCase(ch)) {
                    toggledDomain.append(Character.toUpperCase(ch));
                } else {
                    toggledDomain.append(ch); 
                }
            }
            
            
            System.out.println(username + toggledDomain.toString());
        }
        sc.close();
    }
}