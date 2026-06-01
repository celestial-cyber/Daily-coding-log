import java.util.*;

public class sol7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int opt = in.nextInt();

        int result = N;
        int count = 1;

        if (opt == 1) {

            for (int i = N - 1; i >= 1; i--) {

                if (count % 2 == 1) {
                    result -= i;
                } else {
                    result += i;
                }

                count++;
            }

        } else if (opt == 2) {

            for (int i = N - 1; i >= 1; i--) {

                if (count % 2 == 1) {
                    result += i;
                } else {
                    result -= i;
                }

                count++;
            }
        }

        System.out.println(result);
    }
}