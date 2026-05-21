import java.io.*;
import java.util.*;

public class Main {

    // Function to check palindrome
    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {

            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println("All Substrings:");

        for(int i = 0; i < str.length(); i++) {

            for(int j = i + 1; j <= str.length(); j++) {

                String sub = str.substring(i, j);

                System.out.println(sub);
            }
        }

        System.out.println("\nPalindrome Substrings:");

        for(int i = 0; i < str.length(); i++) {

            for(int j = i + 1; j <= str.length(); j++) {

                String sub = str.substring(i, j);

                if(isPalindrome(sub)) {

                    System.out.println(sub);
                }
            }
        }
    }
}