import java.util.Scanner;

class SimpleCalculator {
    public static int additionSimple(int x, int y) {
        return x + y;
    }

    public static int subtractionSimple(int x, int y) {
        return y - x;
    }

    public static int multiplicationSimple(int x, int y) {
        return x * y;
    }

    public static double divisionSimple(int x, int y) {
        return x == 0 ? Double.POSITIVE_INFINITY : (double) y / x;
    }

    public static int remainderSimple(int n, int m) {
        return n % m;
    }

    public static double squareRootSimple(int n) {
        return n < 0 ? -1 : Math.sqrt(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println("Addition: " + additionSimple(a, b));
        System.out.println("Subtraction: " + subtractionSimple(a, b));
        System.out.println("Multiplication: " + multiplicationSimple(a, b));
        System.out.println("Division: " + divisionSimple(a, b));
        System.out.println("Remainder: " + remainderSimple(a, b));
        System.out.println("Square root of first number: " + squareRootSimple(a));

        sc.close();
    }
}
