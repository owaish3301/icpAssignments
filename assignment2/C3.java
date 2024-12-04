class DiceRoller {
    public static void main(String[] args) {
        int die1 = (int)(Math.random() * 6) + 1;
        int die2 = (int)(Math.random() * 6) + 1;
        
        System.out.printf("Roll 1: %d%nRoll 2: %d%nSum: %d", 
            die1, die2, die1 + die2);
    }
}