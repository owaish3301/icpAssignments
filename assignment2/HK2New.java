import java.util.Scanner;

class EggCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many eggs do you have? ");
        int eggs = input.nextInt();
        
        int gross = eggs / 144;
        int remainingAfterGross = eggs % 144;
        int dozens = remainingAfterGross / 12;
        int leftover = remainingAfterGross % 12;
        
        System.out.printf("Your number of eggs is %d gross, %d dozen, and %d", 
                         gross, dozens, leftover);
        
        input.close();
    }
}