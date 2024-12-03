import java.util.Scanner;

class TemperatureConverter {
    public static void main(String[] args) {
        // Using Scanner for input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter temperature in Fahrenheit: ");
        
        // Read temperature
        double fahrenheit = input.nextDouble();
        
        // Convert to Celsius using the formula
        // Using 5.0/9.0 instead of 5/9 to avoid integer division
        double celsius = (fahrenheit - 32) * (5.0/9.0);
        
        // Display result with 2 decimal places
        System.out.printf("%.2f°F is equal to %.2f°C%n", fahrenheit, celsius);
        
        // Close scanner to prevent resource leak
        input.close();
    }
}