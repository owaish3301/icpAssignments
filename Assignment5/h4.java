import java.util.Scanner;
class CosX {
    public static double factorial(int n) {
        double fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double cosX(double x) {
        double term, sum = 1;
        int n = 2;
        do {
            term = Math.pow(x, n) / factorial(n);
            sum += (n % 4 == 0) ? term : -term;
            n += 2;
        } while (Math.abs(term) > 1e-6);
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x (in radians): ");
        double x = scanner.nextDouble();
        scanner.close();

        System.out.println("cos(" + x + ") ≈ " + cosX(x));
    }
}
