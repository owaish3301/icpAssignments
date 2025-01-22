class Patterns {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // (a) Stars Triangle
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) { // (b) Number Triangle
            for (int j = 1; j <= i; j++) System.out.print(i + " ");
            System.out.println();
        }

        int num = 1; // (c) Sequential Number Triangle
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) System.out.print(num++ + " ");
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) { // (d) Increasing Number Triangle
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }
}
