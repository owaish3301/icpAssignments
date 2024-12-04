class TrigCalculator {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        System.out.printf("cos(5t) + sin(7t) = %.4f", 
            Math.cos(5 * t) + Math.sin(7 * t));
    }
}