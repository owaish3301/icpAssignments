import java.util.Random;
import java.util.Scanner;

public class Q4 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number between 1 and 9: ");
    int userGuess = sc.nextInt();
    Random rand = new Random();
    int computerGuess = rand.nextInt(9) + 1;

    if(computerGuess == userGuess){
        System.out.println("You got it right");
    }
    else if(userGuess == computerGuess - 1 | userGuess == computerGuess + 1){
        System.out.println("Almost got it");
    }
    else{
        System.out.println("You got it wrong");
    }
    sc.close();
   } 
}
