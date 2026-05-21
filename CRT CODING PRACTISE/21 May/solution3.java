import java.io.*;
import java.util.*;

public class Solution {

    public static boolean isUnique(int n) {

        boolean digits[] = new boolean[10];

        while(n > 0) {

            int digit = n % 10;

            if(digits[digit]) {
                return false;
            }

            digits[digit] = true;

            n /= 10;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();

        for(int i = L; i <= R; i++) {

            if(isUnique(i)) {
                System.out.print(i + " ");
            }
        }
    }
}