import java.io.*;
import java.util.*;

public class LexicographicallySmallestRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String s = sc.next();
            int n = s.length();
            
            // 1. Concatenate string with itself to handle wrapping easily
            String duplicate = s + s;
            
            int i = 0; // Current best candidate starting index
            int j = 1; // New candidate starting index to test
            
            // 2. Linear scan using two pointers
            while (i < n && j < n) {
                int k = 0;
                // Compare characters of both rotations side-by-side
                while (k < n && duplicate.charAt(i + k) == duplicate.charAt(j + k)) {
                    k++;
                }
                
                // If we found a difference within the string length
                if (k < n) {
                    if (duplicate.charAt(i + k) > duplicate.charAt(j + k)) {
                        // The rotation at j is smaller, so it becomes the new best candidate
                        i = Math.max(i + k + 1, j);
                        j = i + 1;
                    } else {
                        // The rotation at i is better, skip ahead for j
                        j = j + k + 1;
                    }
                } else {
                    // Entire sequence matched up to length N, break to avoid infinite loops
                    break;
                }
            }
            
            // 3. The smallest rotation starts at index 'i'
            int startIdx = Math.min(i, j);
            System.out.println(duplicate.substring(startIdx, startIdx + n));
        }
        sc.close();
    }
}