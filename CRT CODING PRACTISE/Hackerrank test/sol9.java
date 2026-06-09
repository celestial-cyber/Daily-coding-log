import java.util.*;

public class sol9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] freq = new int[10];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num == 0) {
                freq[0]++;
                continue;
            }

            while (num > 0) {
                int digit = num % 10;
                freq[digit]++;
                num /= 10;
            }
        }

        int ans = 0;

        for (int d = 1; d <= 9; d++) {
            if (freq[d] >= freq[ans]) {
                ans = d;
            }
        }

        System.out.println(ans);
    }
}