// Question: Find the missing number from 1..n given n-1 numbers.
// Solution: Use sum formula and subtract array sum.

public class Question23FindMissingNumber {
    public static int findMissing(int[] arr, int n) {
        int expected = n * (n + 1) / 2;
        int actual = 0;
        for (int value : arr) {
            actual += value;
        }
        return expected - actual;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findMissing(arr, n));
        scanner.close();
    }
}
