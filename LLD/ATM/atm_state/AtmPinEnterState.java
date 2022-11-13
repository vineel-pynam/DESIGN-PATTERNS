package atm_state;

import atm.Atm;

public class AtmPinEnterState extends State{

    private Atm atm;
    public AtmPinEnterState(Atm atm){
        this.atm = atm;
    };

    @Override
    public void enterPin(Integer atmPin){
        boolean isCorrectPin = atm.validatePin(atmPin);
        if( !isCorrectPin ){
            System.out.println("Your Pin is Incorrect");
            super.exitAtm();
        }else{
            atm.setAtmState(atm.getSelectOperationState());
        }
    }
    
}