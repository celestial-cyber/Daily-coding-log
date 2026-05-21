import java.io.*;
import java.util.*;

public class Solution {

    public static boolean isPrime(int n) {

        if(n <= 1) {
            return false;
        }

        for(int i = 2; i * i <= n; i++) {

            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int reverse(int n) {

        int rev = 0;

        while(n > 0) {

            int digit = n % 10;

            rev = rev * 10 + digit;

            n /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int rev = reverse(n);

        if(isPrime(n) && isPrime(rev) && n != rev) {

            System.out.println("Twisted Prime");
        }
        else {

            System.out.println("Not a Twisted Prime");
        }
    }
}