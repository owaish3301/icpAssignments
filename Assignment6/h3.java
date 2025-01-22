import java.util.Scanner;

class MiddleCharacter {
    public static char findMiddleCharacter(String str) {
        int len = str.length();
        return str.charAt(len / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        char middleChar = findMiddleCharacter(str);
        System.out.println("The middle character in the string: " + middleChar);
    }
}
