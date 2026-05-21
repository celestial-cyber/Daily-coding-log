import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();

        // Impossible cases
        if(s == 0 && n > 1) {
            System.out.println(-1);
            return;
        }

        if(s > 9 * n) {
            System.out.println(-1);
            return;
        }

        // Special case
        if(n == 1 && s == 0) {
            System.out.println(0);
            return;
        }

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < n; i++) {

            if(s >= 9) {

                ans.append(9);
                s -= 9;
            }
            else {

                ans.append(s);
                s = 0;
            }
        }

        System.out.println(ans.toString());
    }
}