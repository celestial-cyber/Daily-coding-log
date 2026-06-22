/*
Problem Statement:

Given a string S, remove all duplicate characters from the string
without changing the order of first occurrence of each character.

Constraints:
- Case-sensitive
- You are NOT allowed to use collections like Set, Map, etc.
- Only loops and basic logic are allowed

Input Format:
A single string S

Output Format:
Print the string after removing duplicate characters,
preserving the order of first occurrence.

Sample Input:
programming

Sample Output:
progamin

Sample Input:
banana

Sample Output:
ban
*/

import java.util.*;

class solution21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean found = false;

            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                sb.append(ch);
            }
        }

        System.out.print(sb.toString());
    }
}