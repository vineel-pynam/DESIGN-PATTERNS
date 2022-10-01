package states;

import java.io.*;
import vendingmachine.VendingMachine;
import inventory.Inventory;
import inventory.Product;

public class DispenseState implements State{

   private VendingMachine vendingMachine;

   public DispenseState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
   }
   
    @Override
    public void insertCoin(Integer amount){
        System.out.println("Action Cannot be performed");
    }

    @Override
    public void pressButton(Integer productCode){
        System.out.println("Action Cannot be performed");
    }

    @Override
    public void dispenseProduct(Integer productCode){
        Product product = vendingMachine.getProduct(productCode);
        vendingMachine.reduceProductCount(productCode);
        System.out.println("Dispensed : \n" + product.toString() + "Change: " + (vendingMachine.getAmount() - product.getPrice()) );
        vendingMachine.setState(vendingMachine.getNoCoinInsertedState());
    }
}