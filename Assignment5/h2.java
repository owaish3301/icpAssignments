class Pattern2 {
    public static void main(String[] args) {
        int starNum = 1;
        for (int i = 1; i <= 4; i++) {
            int spaces = (7 - starNum)/2;
            for(int k = 1; k <= spaces; k++){
                System.err.print(" ");
            }
            for(int j = 1; j<=starNum;j++){
                System.err.print("*");
            }
            
            for(int k = 1; k <= spaces; k++){
                System.err.print(" ");
            } 
            System.err.println();
            
            starNum += 2;
        }
    }
}