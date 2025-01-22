import java.util.Scanner;
class GeneralFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = 0, b = 1, c = 1, d;
        System.out.print(a + " " + b + " " + c + " ");
        for (int i = 4; i <= n; i++) {
            d = a + b + c;
            System.out.print(d + " ");
            a = b; b = c; c = d;
        }
        sc.close();
    }
}
