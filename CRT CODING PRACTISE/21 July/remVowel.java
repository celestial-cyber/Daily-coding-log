import java.io.*;
import java.util.*;

public class remVowel{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        
        String s = sc.nextLine();
        
        // Remove all lowercase and uppercase vowels using Regex
        String result = s.replaceAll("[aeiouAEIOU]", "");
        
        System.out.println(result);
        
        sc.close();
    }
}