// Question: Find the intersection of two integer arrays (unique values).
// Solution: Use a boolean seen array for first array, then collect matches.

import java.util.ArrayList;
import java.util.List;

public class Question13ArrayIntersection {
    public static int[] intersection(int[] a, int[] b) {
        boolean[] seen = new boolean[10001];
        for (int value : a) {
            if (value >= 0 && value <= 10000) {
                seen[value] = true;
            }
        }
        List<Integer> result = new ArrayList<>();
        boolean[] added = new boolean[10001];
        for (int value : b) {
            if (value >= 0 && value <= 10000 && seen[value] && !added[value]) {
                result.add(value);
                added[value] = true;
            }
        }
        int[] out = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            out[i] = result.get(i);
        }
        return out;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        int[] result = intersection(a, b);
        for (int i = 0; i < result.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(result[i]);
        }
        System.out.println();
        scanner.close();
    }
}
