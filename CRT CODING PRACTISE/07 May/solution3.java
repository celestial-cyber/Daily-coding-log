import java.util.*;

public class solution3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;

        // Step 1: strictly increasing
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        // must have at least one increase and not end immediately
        if (i == 0 || i == n - 1) {
            System.out.print("NO");
            return;
        }

        // Step 2: strictly decreasing
        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        if (i == n - 1) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}