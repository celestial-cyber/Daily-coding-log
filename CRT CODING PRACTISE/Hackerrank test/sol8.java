import java.util.*;

public class sol8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        int shift = 0;

        for (int i = 0; i < n; i++) {

            long currentValue = arr[(i + shift) % n];

            if (currentValue % 2 == 0) {
                // right rotation by i
                shift = ((shift - (i % n)) % n + n) % n;
            } else {
                // left rotation by i
                shift = (shift + (i % n)) % n;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(arr[(i + shift) % n]);
            if (i < n - 1) sb.append(" ");
        }

        System.out.println(sb);
    }
}