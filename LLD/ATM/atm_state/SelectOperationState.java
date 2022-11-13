package atm_state;

import atm.Atm;

public class SelectOperationState extends State{

    private Atm atm;
    public SelectOperationState(Atm atm){
        this.atm = atm;
    };

    @Override
    public void selectOperation(Operation operation){
        switch(operation){
            case CASH_WITHDRAWAL:
                atm.setAtmState(atm.getCashWithdrawalState());
                break;
            // case CASH_DESPOSIT:
            //     atm.setAtmState();
            //     break;
            // case PIN_CHANGE:
            //     atm.setAtmState();  
            //     break;
            default:
                System.out.println("Invalid Operation");
                super.exitAtm();
        }
    }



    
    
}