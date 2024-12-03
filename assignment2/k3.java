import java.util.Scanner;
class SalaryCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basic = in.nextDouble();
        double da = basic * 0.4;
        double hra = basic * 0.2;
        System.out.printf("DA is %.1f%nHRA is %.1f%nGross salary is %.0f", 
            da, hra, (basic + da + hra));
        in.close();
    }
}