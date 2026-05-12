import java.util.*;

public class solution6 {
    
    // Function to calculate sum from 1 to n
    static long sum(long n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long L = sc.nextLong();
        long R = sc.nextLong();
        long K = sc.nextLong();

        // Total sum from L to R
        long totalSum = sum(R) - sum(L - 1);

        // Find multiples of K in range
        long start = (L + K - 1) / K;
        long end = R / K;

        long count = end - start + 1;
        long multipleSum = 0;

        if (count > 0) {
            multipleSum = K * (count * (start + end)) / 2;
        }

        System.out.println(totalSum - multipleSum);
    }
}