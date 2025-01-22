import java.util.Scanner;

class PalindromeNumber {
    public static int reverse(int number) {
        int rev = 0;
        while (number > 0) {
            rev = rev * 10 + number % 10;
            number /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(isPalindrome(num) ? "Palindrome" : "Not a Palindrome");
        sc.close();
    }
}
