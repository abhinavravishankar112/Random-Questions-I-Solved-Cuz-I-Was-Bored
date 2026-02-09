// Question: Find the first non-repeating character in a string.
// Solution: Count occurrences with an array and scan again.

public class Question10FirstUniqueChar {
    public static int firstUniqueIndex(String s) {
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(firstUniqueIndex(s));
        scanner.close();
    }
}
