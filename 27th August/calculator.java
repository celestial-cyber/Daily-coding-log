import java.util.*;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.println("Enter your choice:");
        char choice = sc.next().charAt(0);

        switch (choice) {
            case '1':
                System.out.println("Result: " + (num1 + num2));
                break;

            case '2':
                System.out.println("Result: " + (num1 - num2));
                break;

            case '3':
                System.out.println("Result: " + (num1 * num2));
                break;

            case '4':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Zero division not allowed");
                }
                break;

            default:
                System.out.println("Invalid operation");
                break;
        }

        sc.close();
    }
}