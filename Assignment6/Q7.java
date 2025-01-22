class VowelCount {
    public static int count(String str) {
        return (int) str.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    }

    public static void main(String[] args) {
        System.out.println("Vowel count: " + count("Welcome"));
    }
}
