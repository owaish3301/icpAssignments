import java.util.Scanner;
class FactorialRange {
    static int fact(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        for (int i = m; i <= n; i++) System.out.println(i + "! = " + fact(i));
        sc.close();
    }
}
