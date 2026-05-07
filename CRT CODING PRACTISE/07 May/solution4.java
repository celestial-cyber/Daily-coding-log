import java.util.*;

public class solution4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        long total = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        long leftSum = 0;

        for (int i = 0; i < n; i++) {

            long rightSum = total - leftSum - arr[i];

            if (leftSum == rightSum) {
                System.out.print(i);
                return;
            }

            leftSum += arr[i];
        }

        System.out.print(-1);
    }
}