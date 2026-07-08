//toggle only if vowels are present else print no vowels present 

//
//Given a string S, convert:
//All lowercase letters → uppercase All uppercase letters → lowercase

//Other characters (digits, spaces, symbols) should remain unchanged.

import java.util.*;

class sol4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        if (!in.hasNextLine()) {
            System.out.println("No vowels present");
            return;
        }
        
        String s = in.nextLine();
        String result = "";
        boolean hasVowel = false;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                
                hasVowel = true; 
                
                
                if (Character.isLowerCase(ch)) {
                    result += Character.toUpperCase(ch);
                } else {
                    result += Character.toLowerCase(ch);
                }
            } else {
                // Keep consonants, numbers, spaces, and symbols exactly the same
                result += ch;
            }
        }
        
        // Print the final result based on the flag
        if (hasVowel) {
            System.out.println(result);
        } else {
            System.out.println("No vowels present");
        }
    }
}