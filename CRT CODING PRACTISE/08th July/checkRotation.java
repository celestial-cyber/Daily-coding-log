//given two strings s1 and s2 check if s1 is the rotated version of s2 // for that jsut add the s1 to s1 
//and it will have all the possible combinationss of the strig s1 

import java.io.*;
import java.util.*;

public class checkRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read both strings (handles inputs separated by space or newline)
        if (sc.hasNext()) {
            String s1 = sc.next();
            String s2 = sc.next();
            
            // 1. Lengths must be equal, and s2 must be a substring of (s1 + s1)
            if (s1.length() == s2.length() && (s1 + s1).contains(s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        sc.close();
    }
}