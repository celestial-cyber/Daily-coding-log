/*
Problem Statement:
Given a number N, compute the result using a zig-zag number pattern.

Pattern:
- Add numbers from 1 to N
- But every 3rd number is subtracted twice

Rule:
- If i % 3 == 0 → result = result - 2 * i
- Else → result = result + i

Input Format:
- A single integer N

Constraints:
- 1 ≤ N ≤ 10^5

Output Format:
- Print the final result as a single integer

Example:
Input:
6

Output:
-6

Explanation:
i = 1 → +1 → result = 1
i = 2 → +2 → result = 3
i = 3 → -6 → result = -3
i = 4 → +4 → result = 1
i = 5 → +5 → result = 6
i = 6 → -12 → result = -6

Final Result = -6
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read input value N
        int N = sc.nextInt();

        // Variable to store final result
        long result = 0;

        // Loop from 1 to N
        for (int i = 1; i <= N; i++) {

            // Check if number is divisible by 3
            if (i % 3 == 0) {

                // Subtract twice the value of i
                result -= (2 * i);
            } else {

                // Add normal numbers
                result += i;
            }
        }

        // Print the final result
        System.out.println(result);
    }
}