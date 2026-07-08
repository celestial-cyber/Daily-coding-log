// take one string - having index 
//check the index if its prime - if its prime then toggle the character otherwise 

import java.util.*;

class sol5 {
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false; 
        for (int j = 2; j * j <= n; j++) {
            if (n % j == 0) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

           
            if (isPrime(i)) {
                
                if (Character.isLowerCase(ch)) {
                    result += Character.toUpperCase(ch);
                } else if (Character.isUpperCase(ch)) {
                    result += Character.toLowerCase(ch);
                } else {
                    result += ch; 
                }
            } else {
               
                result += ch;
            }
        }
        
        System.out.println(result);
    }
}