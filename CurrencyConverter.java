import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define exchange rates (assuming 1 USD as the base currency)
        double usdToEuro = 0.85;
        double usdToGBP = 0.73;
        double usdToINR = 73.28;

        System.out.println("Welcome to Currency Converter");
        System.out.println("Available currencies: 1. Euro (EUR) 2. British Pound (GBP) 3. Indian Rupee (INR)");

        System.out.print("Enter the amount in USD: ");
        double amountUSD = scanner.nextDouble();

        System.out.print("Select the currency to convert to (1/2/3): ");
        int choice = scanner.nextInt();

        double convertedAmount = 0.0;
        String targetCurrency = "";

        switch (choice) {
            case 1:
                convertedAmount = amountUSD * usdToEuro;
                targetCurrency = "Euro (EUR)";
                break;
            case 2:
                convertedAmount = amountUSD * usdToGBP;
                targetCurrency = "British Pound (GBP)";
                break;
            case 3:
                convertedAmount = amountUSD * usdToINR;
                targetCurrency = "Indian Rupee (INR)";
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        if (!targetCurrency.isEmpty()) {
            System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);
        }

        scanner.close();
    }
}
