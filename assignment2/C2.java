class PowerCalculator {
    public static void main(String[] args) {
        int base = Integer.parseInt(args[0]);
        int exponent = Integer.parseInt(args[1]);
        if(base * exponent < 0){
            System.out.println("Both inputs should be positive");
        }
        else
        System.out.printf("%d raised to power %d is %.0f", 
            base, exponent, Math.pow(base, exponent));
    }
}