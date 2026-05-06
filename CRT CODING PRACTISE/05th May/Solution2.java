
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int S = sc.nextInt();

        int count = 0;

        // Check all subarrays
        for (int i = 0; i < N; i++) {

            int sum = 0;

            for (int j = i; j < N; j++) {

                sum += arr[j];

                if (sum == S) {
                    count++;
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}