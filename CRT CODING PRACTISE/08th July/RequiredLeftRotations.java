//given two strings - s1 & s2 tell the minimum number of left rotatiosn required to match with s2 

import java.io.*;
import java.util.*;

public class RequiredLeftRotations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNext()) {
            String s1 = sc.next();
            String s2 = sc.next();
            
            // 1. If lengths don't match, it's impossible
            if (s1.length() != s2.length()) {
                System.out.println(-1);
            } else {
                String combined = s1 + s1;
                
                // 2. Find the first occurrence of s2 in the doubled string
                int rotations = combined.indexOf(s2);
                
                // 3. Print the index (rotations), or -1 if not found
                System.out.println(rotations);
            }
        }
        sc.close();
    }
}