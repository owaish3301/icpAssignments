import java.util.Scanner;
class TwistedPrime {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), rev = 0;
        for (int x = n; x > 0; x /= 10) rev = rev * 10 + x % 10;
        System.out.println((isPrime(n) && isPrime(rev)) ? "Twisted Prime" : "Not Twisted Prime");
        sc.close();
    }
}
