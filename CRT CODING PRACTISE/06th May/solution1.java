
import java.util.*;

public class solution1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int result = 0;

        // XOR all elements
        for (int i = 0; i < N; i++) {
            result ^= sc.nextInt();
        }

        System.out.println(result);

        sc.close();
    }
}