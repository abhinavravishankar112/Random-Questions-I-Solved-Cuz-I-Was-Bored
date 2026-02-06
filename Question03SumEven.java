// Question: Sum all even numbers in an integer array.
// Solution: Add only elements divisible by 2.

public class Question03SumEven {
    public static int sumEven(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            if (value % 2 == 0) {
                sum += value;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(sumEven(arr));
        scanner.close();
    }
}
