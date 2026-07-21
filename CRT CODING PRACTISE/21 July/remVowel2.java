import java.io.*;
import java.util.*;

public class remVowel2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Check if the character is NOT a vowel (case-insensitive)
            if ("aeiouAEIOU".indexOf(ch) == -1) {
                sb.append(ch);
            }
        }
        
        System.out.println(sb.toString());
        
        sc.close();
    }
}