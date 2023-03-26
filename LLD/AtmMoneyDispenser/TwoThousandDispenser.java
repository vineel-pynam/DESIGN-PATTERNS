public class TwoThousandDispenser extends Dispenser{

    public TwoThousandDispenser(Dispenser nextDispenser){
        super(nextDispenser);
    }

    public void dispense(int moneyLeft){
        if( moneyLeft >= 2000 ){
            int count = moneyLeft/2000;
            moneyLeft = moneyLeft%2000;

            System.out.println("Dispensed: " + (2000*count));
        }
        super.dispense(moneyLeft);
    }

}