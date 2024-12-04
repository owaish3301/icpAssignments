class DivisionCalculator {
    public static void main(String[] args) {
        int dividend = Integer.parseInt(args[0]);
        int divisor = Integer.parseInt(args[1]);
        System.out.printf("Quotient: %d%nRemainder: %d", 
            dividend / divisor, dividend % divisor);
    }
}