public class h1 {
    public static void main(String[] args) {
        int starPos = 4; // Start with * at position 4 (0-based index)
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == starPos)
                    System.out.print("* ");
                else if (j < starPos)
                    System.out.print((5-j) + " ");
                else
                    System.out.print((j-starPos+1) + " ");
            }
            System.out.println();
            starPos--;
        }
    }
}