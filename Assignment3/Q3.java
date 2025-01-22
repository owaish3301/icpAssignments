import java.util.Scanner;

public class Q3 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int a = sc.nextInt();
    System.out.print("Enter the second number: ");
    int b = sc.nextInt();
    System.out.print("Enter the third number: ");
    int c = sc.nextInt();

    if(b>a & c>b){
        System.out.println("Increasing");
    }
    else if(a>b & b>c){
        System.out.println("Decreasing");
    }
    else{
        System.out.println("Neither Increasing nor decreasing");
    }

    sc.close();
   } 
}
