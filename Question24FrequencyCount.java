// Question: Count frequency of each character in a string.
// Solution: Use LinkedHashMap to preserve first-seen order.

public class Question24FrequencyCount {
    public static java.util.LinkedHashMap<Character, Integer> frequencyCount(String s) {
        java.util.LinkedHashMap<Character, Integer> map = new java.util.LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s = scanner.nextLine();
        java.util.LinkedHashMap<Character, Integer> map = frequencyCount(s);
        for (java.util.Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        scanner.close();
    }
}
