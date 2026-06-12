//Reverse words at even positions (1-based indexing)
//Keep odd-position words unchanged

//Input:  I am very good student
//Output: I ma very doog student

import java.util.*;

class solution3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String words[] = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            
            // 1-based even position => i+1 is even
            if ((i + 1) % 2 == 0) {
                System.out.print(reverse(words[i]));
            } else {
                System.out.print(words[i]);
            }

            if (i != words.length - 1) {
                System.out.print(" ");
            }
        }
    }

    // helper function to reverse a word
    static String reverse(String word) {
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }
}