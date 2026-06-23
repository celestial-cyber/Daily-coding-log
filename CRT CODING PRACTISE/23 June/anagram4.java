//listen
//silen

//The strings are almost anagrams, and the missing character is:



//ir can be find the missing character using the same frequency-array approach.
import java.util.*;

class anagram4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = in.nextLine();
        String s2 = in.nextLine();

        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i) - 'a']--;
        }

        int missingCount = 0;
        char missingChar = '\0';

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                missingCount += Math.abs(freq[i]);
                missingChar = (char)(i + 'a');
            }
        }

        if (missingCount == 0) {
            System.out.println("Anagram");
        }
        else if (missingCount == 1) {
            System.out.println("Almost Anagram");
            System.out.println("Missing Character: " + missingChar);
        }
        else {
            System.out.println("Not Anagram");
        }
    }
}