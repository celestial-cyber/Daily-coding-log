import java.io.*;
import java.util.*;

public class reverseUsername2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String email = sc.nextLine();
            
            // 1. Find the split point
            int atIndex = email.indexOf('@');
            
            
            
            for(int i = atIndex-1;i>=0;i++){
               System.out.println(email.charAt(i)); 
            }

             for(int i = atIndex;i<email.length();i++){
               System.out.println(email.charAt(i)); 
            }
            
        }
        sc.close();
    }
}