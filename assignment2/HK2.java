interface EggCounter {
    int getGross();
    int getDozen();
    int getLeftover();
}
abstract class BaseEggCalculator {
    final int eggs;
    static final int EGGS_PER_GROSS = 144;
    static final int EGGS_PER_DOZEN = 12;
    
    public BaseEggCalculator(int eggs) {
        this.eggs = eggs;
    }
    
    public abstract String getFormattedResult();
}

class DozenCalculator extends BaseEggCalculator {
    public DozenCalculator(int eggs) {
        super(eggs);
    }
    
    public int getDozen() {
        return eggs / EGGS_PER_DOZEN;
    }
    
    public int getLeftover() {
        return eggs % EGGS_PER_DOZEN;
    }
    
    public String getFormattedResult() {
        return String.format("You have %d dozen eggs and %d eggs leftover", 
            getDozen(), getLeftover());
    }
}

class CompleteEggCalculator extends BaseEggCalculator implements EggCounter {
    public CompleteEggCalculator(int eggs) {
        super(eggs);
    }
    
    public int getGross() {
        return eggs / EGGS_PER_GROSS;
    }
    
    public int getDozen() {
        return (eggs % EGGS_PER_GROSS) / EGGS_PER_DOZEN;
    }
    
    public int getLeftover() {
        return eggs % EGGS_PER_DOZEN;
    }
    
    public String getFormattedResult() {
        return String.format("Your number of eggs is %d gross, %d dozen, and %d", 
            getGross(), getDozen(), getLeftover());
    }
}

class EggCalculatorFactory {
    public static BaseEggCalculator createCalculator(int eggs, boolean includeGross) {
        return includeGross ? new CompleteEggCalculator(eggs) : new DozenCalculator(eggs);
    }
}
class EggCalculatorProgram {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter the number of eggs: ");
        int totalEggs = scanner.nextInt();
    
        BaseEggCalculator calculator = EggCalculatorFactory.createCalculator(totalEggs, true);
        System.out.println(calculator.getFormattedResult());
        
        scanner.close();
    }
}