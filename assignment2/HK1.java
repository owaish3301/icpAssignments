import java.util.Scanner;

class TimeConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = in.nextLong();
        
        long days = minutes / (24 * 60);
        long years = days / 365;
        days %= 365;
        
        System.out.printf("%d minutes is approximately %d years and %d days", 
            minutes, years, days);
        
        in.close();
    }
}