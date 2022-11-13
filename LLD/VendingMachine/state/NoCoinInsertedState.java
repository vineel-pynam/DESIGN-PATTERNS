package state;

import vending_machine.VendingMachine;
public class NoCoinInsertedState extends State{

    private VendingMachine vendingMachine;
    public NoCoinInsertedState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertAmount(Integer amount){
        vendingMachine.setAmount(amount);
        vendingMachine.setVendingMachineState(vendingMachine.getCoinInsertedState());
    }


}