import java.util.Scanner;

class BrickFall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        double t = in.nextDouble();
        
        System.out.printf("Distance travelled: %.3f%n", 0.5 * 32.174 * t * t);
        
        in.close();
    }
}