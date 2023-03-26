public class FiveHundredDispenser extends Dispenser{

    public FiveHundredDispenser(Dispenser nextDispenser){
        super(nextDispenser);
    }

     public void dispense(int moneyLeft){
        if( moneyLeft >= 500 ){
            int count = moneyLeft/500;
            moneyLeft = moneyLeft%500;

            System.out.println("Dispensed: " + (500*count));
        }
        super.dispense(moneyLeft);
    }

}