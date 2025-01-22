class PatternA {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }

        for (int i = 5; i > 0; i--) {
            System.out.println("$ ".repeat(i).trim());
        }
        for (int i = 1; i <= 5; i++) {
            System.out.print(" ".repeat(5 - i));
            System.out.println((i + " ").repeat(i).trim());
        }
    }
}
