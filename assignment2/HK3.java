import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        
        double x1 = in.nextDouble(), y1 = in.nextDouble();
        double x2 = in.nextDouble(), y2 = in.nextDouble();
        double x3 = in.nextDouble(), y3 = in.nextDouble();
        
        // Calculate sides using distance formula
        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        
        // Calculate semi-perimeter and area
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        System.out.printf("The area of the triangle is %.1f", area);
        
        in.close(); 
    }
}