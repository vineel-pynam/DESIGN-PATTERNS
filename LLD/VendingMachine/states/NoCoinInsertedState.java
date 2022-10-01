package states;

import java.io.*;
import vendingmachine.VendingMachine;

public class NoCoinInsertedState implements State{

   private VendingMachine vendingMachine;

   public NoCoinInsertedState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
   }
   
    @Override
    public void insertCoin(Integer amount){
        vendingMachine.setAmount(amount);
        vendingMachine.setState(vendingMachine.getCoinInsertedState());
    }

    @Override
    public void pressButton(Integer productCode){
        System.out.println("No coin is Inserted");
    }

    @Override
    public void dispenseProduct(Integer productCode) {
        System.out.println("No coin is Inserted");
    }
}