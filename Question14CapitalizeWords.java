// Question: Capitalize the first letter of each word in a sentence.
// Solution: Split into words, capitalize each, then join.

public class Question14CapitalizeWords {
    public static String capitalizeWords(String s) {
        String trimmed = s.trim();
        if (trimmed.isEmpty()) {
            return "";
        }
        String[] parts = trimmed.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            String word = parts[i];
            if (!word.isEmpty()) {
                char first = Character.toUpperCase(word.charAt(0));
                sb.append(first);
                if (word.length() > 1) {
                    sb.append(word.substring(1));
                }
            }
            if (i < parts.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(capitalizeWords(s));
        scanner.close();
    }
}
