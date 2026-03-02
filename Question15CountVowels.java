// Question: Count vowels in a string (a, e, i, o, u, case-insensitive).
// Solution: Traverse characters and count matches.

public class Question15CountVowels {
    public static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(countVowels(s));
        scanner.close();
    }
}
