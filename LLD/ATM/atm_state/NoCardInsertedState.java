package atm_state;

import atm.Atm;

public class NoCardInsertedState extends State{

    private Atm atm;
    public NoCardInsertedState(Atm atm){
        this.atm = atm;
    };

    @Override
    public void insertCard(Integer atmCard){
        atm.fetchAndSetAccount(atmCard);
        atm.setAtmState(atm.getAtmPinEnterState());
    }
    
}