import java.util.Scanner;

class PasswordValidation {
    public static boolean isValidPassword(String password) {
        return password.length() >= 8 && password.matches("[a-zA-Z0-9]+") && password.replaceAll("[^0-9]", "").length() >= 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        System.out.println(isValidPassword(sc.next()) ? "Valid Password" : "Invalid Password");
        sc.close();
    }
}
