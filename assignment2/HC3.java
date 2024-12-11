class DigitSum {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        
        int lastDigit = number % 10;
        int firstDigit = number / 1000;
        
        System.out.printf("Sum of first digit (%d) and last digit (%d) = %d", 
            firstDigit, lastDigit, firstDigit + lastDigit);
    }
}