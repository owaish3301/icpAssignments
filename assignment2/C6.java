class ASCIIValue {
    public static void main(String[] args) {
        char ch = args[0].charAt(0);
        System.out.printf("The ASCII value of '%c' is %d", ch, (int)ch);
    }
}