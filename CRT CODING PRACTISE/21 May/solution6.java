import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int sum = 0;

        for(int i = 0; i < s.length(); i++) {

            int digit = s.charAt(i) - '0';

            sum += digit * (i + 1);
        }

        System.out.println(sum);
    }
}