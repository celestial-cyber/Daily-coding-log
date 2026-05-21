

public class solution1 {

    // Function to check prime
    public static boolean isPrime(int n) {

        if(n <= 1) {
            return false;
        }

        for(int i = 2; i * i <= n; i++) {

            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        boolean flag = true;

        for(int i = 0; i < n - 1; i++) {

            boolean first = isPrime(arr[i]);
            boolean second = isPrime(arr[i + 1]);

            // If both are same type
            if(first == second) {

                flag = false;
                break;
            }
        }

        if(flag) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}