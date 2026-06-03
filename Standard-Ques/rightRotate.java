import java.util.*;

public class rightRotate {

    public static void rotate(int[] arr, int k, int option) {

        int n = arr.length;
        k = k % n;

        int[] result = new int[n];

        if (option == 1) { // Right Rotation

            for (int i = 0; i < n; i++) {
                result[(i + k) % n] = arr[i];
            }

        } else if (option == 2) { // Left Rotation

            for (int i = 0; i < n; i++) {
                result[i] = arr[(i + k) % n];
            }

        } else {
            System.out.println("Invalid option");
            return;
        }

        System.out.println("Rotated Array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter rotation count: ");
        int k = sc.nextInt();

        System.out.print("Enter option (1 = Right, 2 = Left): ");
        int option = sc.nextInt();

        rotate(arr, k, option);
    }
}