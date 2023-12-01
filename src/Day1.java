public class Day1 {
    static String[] input;
    public static void solve() {
        input = ReadInput.getText("Day1");

        part1();
        // part2();
    }

    private static void part1() {
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
        System.out.println("Part 1: " + sum);
    }

    private static void part2() {

    }
}
