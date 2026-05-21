import java.io.*;
import java.util.*;

public class Solution {

    public static boolean isPrime(long n) {

        if(n <= 1) {
            return false;
        }

        for(long i = 2; i * i <= n; i++) {

            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        long root = (long)Math.sqrt(N);

        if(root * root == N && isPrime(root)) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}