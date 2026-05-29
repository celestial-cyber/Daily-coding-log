/*
Problem Statement:
Given an integer N, compute the result using the following pattern:

Result = 1! - 2! + 3! - 4! + 5! - 6! ... ± N!

The sign alternates:
- Odd factorial → add
- Even factorial → subtract

Input Format:
- A single integer N

Constraints:
- 1 ≤ N ≤ 15

Output Format:
- Print the final result as a single integer

Example:
Input:
4

Output:
-19

Explanation:
1! - 2! + 3! - 4!
= 1 - 2 + 6 - 24
= -19
*/

import java.io.*;
import java.util.*;

public class sol5 {

    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read value of N
        int N = sc.nextInt();

        // Variable to calculate factorial
        long factorial = 1;

        // Variable to store final result
        long result = 0;

        // Loop from 1 to N
        for (int i = 1; i <= N; i++) {

            // Calculate factorial
            factorial *= i;

            // Add odd factorials and subtract even factorials
            if (i % 2 == 0) {
                result -= factorial;
            } else {
                result += factorial;
            }
        }

        // Print final result
        System.out.println(result);
    }
}