import java.util.Scanner;

class DistanceConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the distance in km = ");
        double km = in.nextDouble();
        
        System.out.printf("%.0f km is %.0f meters%n", km, km * 1000);
        System.out.printf("%.0f km is %.4f feet%n", km, km * 3280.8399);
        System.out.printf("%.0f km is %.4f inches%n", km, km * 39370.0787);
        System.out.printf("%.0f km is %.0f centimetres%n", km, km * 100000);
        
        in.close();
    }
}