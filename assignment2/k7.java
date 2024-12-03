class PowerTable {
    public static void main(String[] args) {
        System.out.printf("%-8s%-8s%-8s%n", "a", "b", "pow(a,b)");
        
        
        for(int i = 0; i < 5; i++) {
            System.out.printf("%-8d%-8d%-8d%n", 
                i + 1,              // a value
                i + 2,              // b value
                (int)Math.pow(i + 1, i + 2)  // power value
            );
        }
    }
}