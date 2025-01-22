class StringPalindrome {
    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }
}
