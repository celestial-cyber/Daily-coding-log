//reverse he first and last lette rof the word 
import java.io.*;
import java.util.*;

public class revWord{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        
        String s = sc.nextLine();
        
        // 1. Create a word array by splitting on space
        String[] words = s.split(" ");
        
        // 2. Loop through each word
        for (int i = 0; i < words.length; i++) {
            char[] wordChars = words[i].toCharArray();
            
            // Swap first and last character if length > 1
            if (wordChars.length > 1) {
                char temp = wordChars[0];
                wordChars[0] = wordChars[wordChars.length - 1];
                wordChars[wordChars.length - 1] = temp;
            }
            
            words[i] = new String(wordChars);
        }
        
        // 3. Print the resulting words joined by space
        System.out.println(String.join(" ", words));
    }
}