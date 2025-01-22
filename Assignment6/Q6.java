import java.util.Scanner;

class CharOccurrences {
    public static int count(String str, char a) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == a) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        System.out.println("Occurrences: " + count(str, ch));
        sc.close();
    }
}
