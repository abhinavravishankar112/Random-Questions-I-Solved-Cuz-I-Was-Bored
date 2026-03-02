// Question: Find factorial of a non-negative integer n.
// Solution: Multiply numbers from 2 to n.

public class Question16Factorial {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
        scanner.close();
    }
}
