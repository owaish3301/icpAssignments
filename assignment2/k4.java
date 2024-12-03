import java.util.Scanner;

class DigitSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int num = in.nextInt();
        int sum = 0;
        
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        System.out.println("The sum of the digits is " + sum);
        in.close();
    }
}