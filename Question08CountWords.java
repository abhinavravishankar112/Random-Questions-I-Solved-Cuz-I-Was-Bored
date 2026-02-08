// Question: Count the number of words in a string (words separated by spaces).
// Solution: Split by whitespace after trimming.

public class Question08CountWords {
    public static int countWords(String s) {
        String trimmed = s.trim();
        if (trimmed.isEmpty()) {
            return 0;
        }
        String[] parts = trimmed.split("\\s+");
        return parts.length;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(countWords(s));
        scanner.close();
    }
}
