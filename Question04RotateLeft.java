// Question: Rotate an array left by k positions.
// Solution: Use a temporary array and copy elements to new positions.

public class Question04RotateLeft {
    public static int[] rotateLeft(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n];
        k = k % n;
        for (int i = 0; i < n; i++) {
            int newIndex = (i - k + n) % n;
            result[newIndex] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int[] rotated = rotateLeft(arr, k);
        for (int i = 0; i < rotated.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(rotated[i]);
        }
        System.out.println();
        scanner.close();
    }
}
