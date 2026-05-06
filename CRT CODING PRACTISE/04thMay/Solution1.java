import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int j = 0;

        // Move non-zero elements
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }

        // Fill zeros
        while(j < n) {
            arr[j++] = 0;
        }

        // Print result
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}



//time complexity = o(n)
//space complexity is o(1) in place 