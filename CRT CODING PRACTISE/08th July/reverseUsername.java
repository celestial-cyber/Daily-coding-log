//reverse the username in the email only 
import java.util.*;

public class reverseUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String email = sc.nextLine();
            
            // 1. Find the split point
            int atIndex = email.indexOf('@');
            
            // 2. Separate username and domain
            String username = email.substring(0, atIndex);
            String domain = email.substring(atIndex);
            
            // 3. Reverse the username
            String reversedUsername = new StringBuilder(username).reverse().toString();
            
            // 4. Print the final combined string
            System.out.println(reversedUsername + domain);
        }
        sc.close();
    }
}