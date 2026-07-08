import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * ================================================================================
 * PROBLEM STATEMENT:
 * You are given a string S. Your task is to:
 * 1. Toggle the case of characters present at prime indices (0-based indexing).
 * 2. Keep all other characters unchanged.
 * * Toggle Rules:
 * - Lowercase -> Uppercase
 * - Uppercase -> Lowercase
 * - Non-alphabet characters remain unchanged.
 * * Prime indices include: 2, 3, 5, 7, 11, 13, 17, 19, ...
 * (Note: 0 and 1 are NOT prime numbers).
 * * CONSTRAINTS:
 * 1 <= length of S <= 10^5
 * String contains alphabets (a-z, A-Z), digits, and special characters.
 * ================================================================================
 * ALGORITHM:
 * 1. Read the input string efficiently using BufferedReader.
 * 2. Initialize a helper method `isPrime(int n)` to check if an index is prime:
 * - Numbers less than or equal to 1 are not prime.
 * - Loop from 2 up to sqrt(n) to find divisors.
 * 3. Convert the string to a character array so we can safely modify characters 
 * by index in-place.
 * 4. Iterate through each index of the character array from 0 to S.length() - 1:
 * - Check if the current index is prime using our helper method.
 * - If the index is prime, check if the character is an alphabet character.
 * - Toggle its case using Character.toLowerCase() or Character.toUpperCase().
 * 5. Reconstruct the string from the modified character array and print it.
 * ================================================================================
 * COMPLEXITY ANALYSIS:
 * - Time Complexity: O(N * sqrt(max_index)) in the worst theoretical case, but 
 * practically faster because non-primes exit instantly. Since the maximum index 
 * is N = 10^5, checking primality takes at most sqrt(10^5) ≈ 316 operations per 
 * prime index. The overall execution runs well within the 2-second time limit.
 * * - Space Complexity: O(N)
 * To store the characters of the input string inside a mutable array.
 * ================================================================================
 */

public class TogglePrimeIndex {
    
    // Helper function to check if a number (index) is prime
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        // Check divisors up to square root of n
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        // 1. Efficient reading using BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        if (s == null || s.isEmpty()) {
            return;
        }
        
        // 3. Convert string to character array for in-place modifications
        char[] chars = s.toCharArray();
        
        // 4. Loop through every index of the string
        for (int i = 0; i < chars.length; i++) {
            // Check if the current index is a prime number
            if (isPrime(i)) {
                char c = chars[i];
                
                // Toggle the case if it's an alphabetical letter
                if (Character.isUpperCase(c)) {
                    chars[i] = Character.toLowerCase(c);
                } else if (Character.isLowerCase(c)) {
                    chars[i] = Character.toUpperCase(c);
                }
                // Non-alphabet characters remain unchanged automatically
            }
        }
        
        // 5. Output the final modified string
        System.out.println(new String(chars));
    }
}