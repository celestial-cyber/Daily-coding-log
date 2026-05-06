
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int K = sc.nextInt();

        int count = 0;

        // Check all pairs
        for (int i = 0; i < N; i++) {

            for (int j = i + 1; j < N; j++) {

                if ((arr[i] + arr[j]) % K == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}