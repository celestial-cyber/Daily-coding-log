import java.util.*;

public class solution5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n == 0) {
            System.out.println(0);
        } 
        else if (n % 9 == 0) {
            System.out.println(9);
        } 
        else {
            System.out.println(n % 9);
        }
    }
}