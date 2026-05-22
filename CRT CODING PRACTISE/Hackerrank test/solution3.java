import java.util.*;

public class solution3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] array = new int[size];

        int count = 0;

        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++) {

            int sum = 0;

            for(int j = i; j < size; j++) {

                sum += array[j];

                int root = (int)Math.sqrt(sum);

                if(root * root == sum) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}