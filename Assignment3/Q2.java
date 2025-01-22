import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of water you drank today: ");
        int waterDrank = sc.nextInt();
        if(waterDrank >= 5000){
            System.out.println("Yes, Alice is following doctor’s advice");
        }
        else{
            System.out.println("No, Alice is not following doctor’s advice");
        }
        sc.close();
    }    
}
