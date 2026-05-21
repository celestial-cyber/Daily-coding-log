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

        int k = sc.nextInt();

        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;

        for(int right = 0; right < n; right++) {

            if(nums[right] == 0) {
                zeroCount++;
            }

            while(zeroCount > k) {

                if(nums[left] == 0) {
                    zeroCount--;
                }

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength);
    }
}