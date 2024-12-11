class SimpleInterest {
    public static void main(String[] args) {
        double principal = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        double time = Double.parseDouble(args[2]);
        
        double interest = (principal * rate * time) / 100;
        System.out.printf("Simple Interest = %.2f", interest);
    }
}