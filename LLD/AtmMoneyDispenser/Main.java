public class Main{
    public static void main(String[] args){
        Dispenser dispenser = new TwoThousandDispenser(new FiveHundredDispenser(new HundredDispenser(null)));
        dispenser.dispense(2675);
        dispenser.dispense(32432);
    }
}