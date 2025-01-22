import java.util.Scanner;
class Amicable {
    static int sumDiv(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) if (n % i == 0) sum += i;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println((sumDiv(a) == b && sumDiv(b) == a) ? "Amicable" : "Not Amicable");
        sc.close();
    }
}
