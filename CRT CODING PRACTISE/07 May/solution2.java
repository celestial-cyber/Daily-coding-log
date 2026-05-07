
import java.util.*;

public class solution2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        int even_sum = 0;
        int odd_sum = 0;
        int position = 1;

        while (num > 0) {
            long digit = num % 10;

            if (position % 2 == 0) {
                even_sum += digit;
            } else {
                odd_sum += digit;
            }

            num = num / 10;
            position++;
        }

        System.out.print(Math.abs(even_sum - odd_sum));
    }
}