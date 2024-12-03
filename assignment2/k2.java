import java.util.Scanner;

class DistanceConverter {
    // Constants for conversion factors
    private static final double KM_TO_METERS = 1000;
    private static final double KM_TO_FEET = 3280.8399;
    private static final double KM_TO_INCHES = 39370.0787;
    private static final double KM_TO_CM = 100000;

    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Get distance in kilometers
        System.out.print("Enter the distance in km = ");
        double kilometers = scanner.nextDouble();

        // Calculate conversions
        double meters = kilometers * KM_TO_METERS;
        double feet = kilometers * KM_TO_FEET;
        double inches = kilometers * KM_TO_INCHES;
        double centimeters = kilometers * KM_TO_CM;

        // Display results
        System.out.printf("%.0f km is %.0f meters%n", kilometers, meters);
        System.out.printf("%.0f km is %.4f feet%n", kilometers, feet);
        System.out.printf("%.0f km is %.4f inches%n", kilometers, inches);
        System.out.printf("%.0f km is %.0f centimetres%n", kilometers, centimeters);

        // Close scanner
        scanner.close();
    }
}