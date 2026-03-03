// Question: Check if a number is prime.
// Solution: Test divisibility from 2 up to sqrt(n).

public class Question18IsPrime {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
        scanner.close();
    }
}
