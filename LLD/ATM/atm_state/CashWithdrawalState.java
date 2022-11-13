package atm_state;

import atm.Atm;

public class CashWithdrawalState extends State{

    private Atm atm;
    public CashWithdrawalState(Atm atm){
        this.atm = atm;
    };

    @Override
    public void withdrawCash(Integer amount){
        boolean hasSufficientAmount = atm.hasSufficientAmount(amount);
        if( !hasSufficientAmount ){
            super.exitAtm();
        }else{
            atm.reduceAmount(amount);
            atm.generateSlip(amount);
            atm.setAtmState(atm.getNoCardInsertedState());
        }
    }



    
    
}