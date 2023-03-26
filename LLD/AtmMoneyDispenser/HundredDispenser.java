public class HundredDispenser extends Dispenser{

    public HundredDispenser(Dispenser nextDispenser){
        super(nextDispenser);
    }

     public void dispense(int moneyLeft){
        if( moneyLeft >= 100 ){
            int count = moneyLeft/100;
            moneyLeft = moneyLeft%100;

            System.out.println("Dispensed: " + (100*count));
        }
        super.dispense(moneyLeft);
    }

}