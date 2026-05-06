
import java.util.*;

public class solution2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < N; i++) {

            // Check non-decreasing
            if (arr[i] < arr[i - 1]) {
                increasing = false;
            }

            // Check non-increasing
            if (arr[i] > arr[i - 1]) {
                decreasing = false;
            }
        }

        if (increasing || decreasing) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}