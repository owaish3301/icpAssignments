import java.util.Scanner;
import java.util.Arrays;

class ConsecutiveNumbers {
    public static boolean areConsecutive(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        return arr[1] == arr[0] + 1 && arr[2] == arr[1] + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        sc.close();

        System.out.println("Are numbers consecutive? " + areConsecutive(num1, num2, num3));
    }
}
