import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDuplicateDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // HashMap to store the count of each digit
        Map<Integer, Integer> digitCountMap = new HashMap<>();

        // Process the number to count the occurrences of each digit
        while (num > 0) {
            int lastDigit = num % 10; // Get the last digit
            digitCountMap.put(lastDigit, digitCountMap.getOrDefault(lastDigit, 0) + 1); // Increment the count
            num /= 10; // Remove the last digit
        }

        // Count how many digits appear more than once
        long count = digitCountMap.values().stream().filter(frequency -> frequency > 1).count();

        System.out.println("Number of digits that appear more than once: " + count);
        scanner.close(); // Close the scanner
    }
}
