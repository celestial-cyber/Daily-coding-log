import java.io.*;
import java.util.*;

public class removeChar2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the full sentence string
        String s = scanner.nextLine();
        
        // Read the target character x
        char x = scanner.nextLine().charAt(0);
        
        /* * WHY ARE WE USING Character.toString(x)?
         * The Java method `s.replace(CharSequence target, CharSequence replacement)` 
         * expects Strings as its inputs, not primitive chars. 
         * Since 'x' is a `char`, we use Character.toString(x) to turn it into a 
         * 1-character String so the replace method accepts it.
         */
        String targetStr = Character.toString(x);
        
        /* * HOW DOES s.replace() WORK?
         * This built-in function scans the entire string `s`. Every time it finds 
         * the `targetStr`, it swaps it out with the replacement string.
         * * By passing an empty string "" as the replacement, we are telling Java:
         * "Every time you see this character, replace it with nothing" — which 
         * effectively deletes it!
         */
        String result = s.replace(targetStr, "");
        
        // Print the final modified string
        System.out.println(result);
    }
}