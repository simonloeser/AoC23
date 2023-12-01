import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day1 {
    static String[] input;
    private static Map<String, String> wordFormToNumberMap = new HashMap<>();

    static {
        wordFormToNumberMap.put("one", "1");
        wordFormToNumberMap.put("two", "2");
        wordFormToNumberMap.put("three", "3");
        wordFormToNumberMap.put("four", "4");
        wordFormToNumberMap.put("five", "5");
        wordFormToNumberMap.put("six", "6");
        wordFormToNumberMap.put("seven", "7");
        wordFormToNumberMap.put("eight", "8");
        wordFormToNumberMap.put("nine", "9");
    }
    public static void solve() {
        input = ReadInput.getText("Day1");

        // Part 1
        System.out.println("Part 1: " + addLineNumbers());

        // Part 2
        System.out.println("Part 2: " + replaceNumberWords());
    }

    private static int replaceNumberWords() {
        for (int i = 0; i < input.length; i++) {
            for (String pattern : wordFormToNumberMap.keySet()) {
                input[i] = input[i].replaceAll(pattern, wordFormToNumberMap.get(pattern));
            }
        }
        return addLineNumbers();
    }

    private static int addLineNumbers() {
        int sum = 0;
        for (String line : input) {
            StringBuilder numbers = new StringBuilder();

            for (int i = 0; i < line.length(); i++) {
                try {
                    numbers.append(Integer.parseInt(String.valueOf(line.charAt(i))));
                } catch (NumberFormatException ignored) {
                }
            }

            if (numbers.isEmpty()) continue;
            String number = numbers.charAt(0) + String.valueOf(numbers.charAt(numbers.length() - 1));
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
