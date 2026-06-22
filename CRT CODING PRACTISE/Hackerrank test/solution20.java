/*
Problem Statement:

Given a string S, reverse only those words whose length is odd,
while keeping even-length words unchanged. Maintain the original
word order in the output.

Input Format:
A single line string S

Constraints:
1 ≤ length of string ≤ 10^4
Words are separated by a single space

Output Format:
Print the modified string

Example:
Input:
hello world java code

Output:
olleh dlrow java code
*/





import java.util.*;

class solution20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] words = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String w = words[i];

            if (w.length() % 2 == 1) {
                sb.append(reverse(w));
            } else {
                sb.append(w);
            }

            if (i != words.length - 1) {
                sb.append(" ");
            }
        }

        System.out.print(sb.toString());
    }

    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
