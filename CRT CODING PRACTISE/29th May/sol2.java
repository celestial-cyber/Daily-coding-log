import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        while (i < positive.size() && j < negative.size()) {
            result.add(positive.get(i++));
            result.add(negative.get(j++));
        }

        while (i < positive.size()) {
            result.add(positive.get(i++));
        }

        while (j < negative.size()) {
            result.add(negative.get(j++));
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}