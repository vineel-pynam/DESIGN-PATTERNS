public abstract class Dispenser{

    Dispenser nextDispenser;
    public Dispenser(Dispenser nextDispenser){
        this.nextDispenser = nextDispenser;
    }

    public void dispense(int moneyLeft){
        if( this.nextDispenser != null ){
            nextDispenser.dispense(moneyLeft);
        }else{
            System.out.println("Collect the change: " + moneyLeft );
        }
    }
}