// Question: Find the second largest value in an integer array.
// Solution: Track the largest and second largest while scanning.

public class Question05SecondLargest {
    public static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > largest) {
                second = largest;
                largest = value;
            } else if (value > second && value != largest) {
                second = value;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(secondLargest(arr));
        scanner.close();
    }
}
