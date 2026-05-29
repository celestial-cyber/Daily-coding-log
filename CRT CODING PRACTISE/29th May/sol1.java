import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int countZero = 0, countOne = 0;

        // Read array elements and count 0s and 1s
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if (num == 0) {
                countZero++;
            } else {
                countOne++;
            }
        }

        // Print all 0s first
        for (int i = 0; i < countZero; i++) {
            System.out.print("0 ");
        }

        // Print all 1s at the end
        for (int i = 0; i < countOne; i++) {
            System.out.print("1 ");
        }
    }
}