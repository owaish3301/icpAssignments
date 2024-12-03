import java.util.Scanner;
class HemisphereCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the hemisphere: ");
        double r = in.nextDouble();
        
        System.out.printf("The surface area of the hemisphere is %.3f%n", 3 * Math.PI * r * r);
        System.out.printf("The volume area of the hemisphere is %.3f%n", (2.0/3.0) * Math.PI * r * r * r);
        
        in.close();
    }
}