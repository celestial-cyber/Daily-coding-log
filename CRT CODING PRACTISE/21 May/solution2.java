import java.io.*;
import java.util.*;

public class solution2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int threshold = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int ans = -1;

        for(int i = 0; i < n; i++) {

            sum += arr[i];

            if(sum > threshold) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}