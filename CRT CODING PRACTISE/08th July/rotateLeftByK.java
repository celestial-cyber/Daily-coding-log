//rotate the string left by k position

import java.io.*;
import java.util.*;

public class rotateLeftByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNext()) {
            String s = sc.next();
            long k = sc.nextLong(); // K can be up to 10^9, so use long
            
            int n = s.length();
            
            // 1. Reduce K to fit within the string length
            int effectiveK = (int) (k % n);
            
            // 2. Extract the two parts and combine them
            String firstPart = s.substring(0, effectiveK);
            String secondPart = s.substring(effectiveK);
            
            // 3. Print the left-rotated string
            System.out.println(secondPart + firstPart);
        }
        sc.close();
    }
}