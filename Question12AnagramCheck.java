// Question: Check if two strings are anagrams (case-sensitive).
// Solution: Count characters and compare counts.

public class Question12AnagramCheck {
    public static boolean areAnagrams(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int[] count = new int[256];
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(areAnagrams(a, b));
        scanner.close();
    }
}
