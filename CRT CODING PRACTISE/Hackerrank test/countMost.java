
/*
 * Problem: Count Subarrays with Sum in Given Range
 * 
 * Given an array A of N integers, find the number of contiguous 
 * subarrays whose sum lies in the inclusive range [L, R].
 * 
 * Constraints:
 * 1 <= N <= 10^5
 * 1 <= A[i] <= 10^9
 * 1 <= L <= R <= 10^14
 */



import java.io.*;
import java.util.*;

public class countMost {

    private static long countAtMost(long[] A, int n, long target) {
        if (target < 0) return 0;
        int left = 0;
        long currentSum = 0;
        long count = 0;

        for (int right = 0; right < n; right++) {
            currentSum += A[right];
            while (left <= right && currentSum > target) {
                currentSum -= A[left];
                left++;
            }
            count += (right - left + 1);
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) return;

        StringTokenizer st = new StringTokenizer(line);
        int n = Integer.parseInt(st.nextToken());
        long l = Long.parseLong(st.nextToken());
        long r = Long.parseLong(st.nextToken());

        long[] A = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }

        long ans = countAtMost(A, n, r) - countAtMost(A, n, l - 1);
        System.out.println(ans);
    }
}