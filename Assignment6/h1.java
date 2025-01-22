class FirstNonRepeated {
    public static char firstNonRepeated(String str) {
        for (char c : str.toCharArray()) {
            if (str.indexOf(c) == str.lastIndexOf(c)) return c;
        }
        return '\0';
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeated("Java"));
    }
}
