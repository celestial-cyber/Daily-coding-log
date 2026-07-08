//given a string and a charcater - remove the character from the string and return the string as it is 
import java.io.*;
import java.util.*;

public class removeChar1 {
    public static void main(String[] args) {
        // We use Scanner to read inputs from the standard input stream (System.in).
        Scanner scanner = new Scanner(System.in);
        
        /* * WHY nextLine() INSTEAD OF next()?
         * The problem states that the string S can contain spaces (e.g., "welcome to mettl").
         * - scanner.next() stops reading as soon as it hits a whitespace/space.
         * - scanner.nextLine() reads the entire line including spaces until it hits a newline (\n).
         */
        String s = scanner.nextLine();
        
        /* * WHY charAt(0)?
         * Scanner does not have a built-in `nextChar()` method. 
         * To get a single character, we read the entire next line as a String using nextLine(), 
         * and then grab the very first character at index 0 using .charAt(0).
         */
        char x = scanner.nextLine().charAt(0);
        
        /* * WHY ARE WE USING StringBuilder INSTEAD OF A REGULAR STRING?
         * In Java, Strings are "immutable" (unchangeable). Every time you do standard string 
         * concatenation like `str = str + ch`, Java actually throws away the old string and 
         * creates a brand new one in memory. Doing this inside a loop of size 10^5 is incredibly 
         * slow and will cause a "Time Limit Exceeded" (TLE) error.
         * * StringBuilder is "mutable" (modifiable). It acts like a dynamic, resizable array of characters. 
         * It updates the text in place without constantly creating new objects, making it fast and efficient.
         */
        StringBuilder result = new StringBuilder();
        
        // Loop through every single character index from 0 up to the length of the string
        for (int i = 0; i < s.length(); i++) {
            
            /* * WHY s.charAt(i)?
             * Strings are not primitive character arrays in Java; you cannot do `s[i]`. 
             * We must use the .charAt(i) method to extract the character located at index 'i'.
             */
            char currentChar = s.charAt(i);
            
            /* * THE FILTERING LOGIC:
             * We only want to delete 'x'. This means any character that is NOT equal to 'x' 
             * is safe, and we want to keep it.
             */
            if (currentChar != x) {
                // .append() adds the character to the end of our growing StringBuilder workspace
                result.append(currentChar);
            }
        }
        
        /* * WHY result.toString()?
         * System.out.println() expects a printable representation. 
         * While println can print a StringBuilder directly, explicitly calling .toString() 
         * converts our mutable workspace back into a clean, official, immutable Java String object.
         */
        System.out.println(result.toString());
    }
}