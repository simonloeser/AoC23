import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n  #### AoC 2023 ####\n----------------------\n");
        System.out.print("Daynumber to start: ");

        Map<Integer, Runnable> dayMap = new HashMap<>();

        // Solutions
        dayMap.put(1, Day1::solve);

        Scanner reader = new Scanner(System.in);
        int input = reader.nextInt();
        reader.close();
        System.out.println("\n----------------------\n");

        dayMap.get(input).run();
    }
}
