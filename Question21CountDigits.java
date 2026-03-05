// Question: Count digits in an integer.
// Solution: Repeatedly divide absolute value by 10.

public class Question21CountDigits {
    public static int countDigits(int n) {
        int value = Math.abs(n);
        if (value == 0) {
            return 1;
        }
        int count = 0;
        while (value > 0) {
            value /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countDigits(n));
        scanner.close();
    }
}
