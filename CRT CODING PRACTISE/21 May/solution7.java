import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int nums[] = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int count = 0;
        int max = 0;

        for(int i = 0; i < n; i++) {

            if(nums[i] == 1) {

                count++;

                max = Math.max(max, count);
            }
            else {

                count = 0;
            }
        }

        System.out.println(max);
    }
}