

import java.util.*;

class modulus{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int divisor = num2/num1;
        int remainder = num2 - (num1* divisor);
        System.out.println(remainder);
    }
}