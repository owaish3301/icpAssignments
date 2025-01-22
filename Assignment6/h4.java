import java.util.Scanner;
class WordCount {
    public static int countWords(String str) {
        if (str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        sc.close();

        System.out.println("Number of words in the string: " + countWords(str));
    }
}
