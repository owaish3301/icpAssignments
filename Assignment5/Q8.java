import java.util.Scanner;
class SumSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0, termSum = 0;
        for (int i = 1; i <= n; i++) {
            termSum += i;
            sum += termSum;
        }
        System.out.println(sum);
        sc.close();
    }
}
