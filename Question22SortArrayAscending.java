// Question: Sort an array in ascending order.
// Solution: Use Arrays.sort and print result.

public class Question22SortArrayAscending {
    public static void sortAscending(int[] arr) {
        java.util.Arrays.sort(arr);
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        sortAscending(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(arr[i]);
        }
        System.out.println();
        scanner.close();
    }
}
