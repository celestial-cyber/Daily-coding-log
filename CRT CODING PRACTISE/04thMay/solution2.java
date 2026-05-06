
import java.util.*;

public class solution2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Swap adjacent elements
        for (int i = 0; i < N - 1; i += 2) {

            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        // Print result
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]);

            if (i != N - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}