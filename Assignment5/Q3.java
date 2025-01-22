import java.util.Scanner;
class PrimeRange {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        for (int i = m; i <= n; i++) if (isPrime(i)) System.out.print(i + " ");
        sc.close();
    }
}
