import java.util.*;

public class solution2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int T = sc.nextInt();

        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {

            int sum = 0;

            for(int j = i; j < n; j++) {

                sum += arr[j];

                int diff = Math.abs(T - sum);

                minDiff = Math.min(minDiff, diff);
            }
        }

        System.out.println(minDiff);
    }
}