//axel , axl -> if only one characters is missing to become an anagram print almost anagram 
//else either its s already an anagram or not an anagram 
// instaed of taking int a[] = new int[256] we will take new int[26] cause we are only finding lower case character frequency count 
// ch = s.charAt(i)
//take a[ch='a']++;//a[97-97] = a[0] = 3 means a is oberseved thrice in abaac same goes to a[98-97] =a[1] means frequency of b =1 in the same string
//array bucketing using with implicit type casting
import java.util.*;

class anagram3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        String s1 = in.nextLine();
        String s2 = in.nextLine();

        int[] a = new int[26];

        // Frequency count of first string
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            a[ch - 'a']++;
        }

        // Subtract frequency count of second string
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            a[ch - 'a']--;
        }

        int diff = 0;

        for (int i = 0; i < 26; i++) {
            diff += Math.abs(a[i]);
        }

        if (diff == 0) {
            System.out.println("Anagram");
        }
        else if (diff == 1) {
            System.out.println("Almost Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }
}
       



