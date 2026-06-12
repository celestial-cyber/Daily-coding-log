//preserve spaces in te same order
// ravi is best in singing -> gnig si snit se bsilvar

import java.util.*;

class solution2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char[] result = new char[s.length()];

        // Step 1: mark spaces in result
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                result[i] = ' ';
            }
        }

        // Step 2: collect non-space characters in reverse
        int j = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                while (s.charAt(j) == ' ') {
                    j--;
                }
                result[i] = s.charAt(j);
                j--;
            }
        }

        // Step 3: print result
        System.out.println(new String(result));
    }
}