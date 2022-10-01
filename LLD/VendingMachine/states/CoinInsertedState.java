package states;

import java.io.*;
import vendingmachine.VendingMachine;
import inventory.Inventory;
import inventory.Product;

public class CoinInsertedState implements State{

   private VendingMachine vendingMachine;


   public CoinInsertedState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
   }
   
    @Override
    public void insertCoin(Integer amount){
        vendingMachine.setAmount(vendingMachine.getAmount() + amount);
    }

    @Override
    public void pressButton(Integer productCode){
        Product product = vendingMachine.getProduct(productCode);

        if( !vendingMachine.isProductAvailable(productCode) ){
            System.out.println("Product Not Found");
        }else if( vendingMachine.hasSufficientAmount(product.getPrice()) ){
           System.out.println("Insufficient Amount");
        }else{
            vendingMachine.setState(vendingMachine.getDispenseState());
            vendingMachine.dispenseProduct(productCode);
        }
    }

    @Override
    public void dispenseProduct(Integer productCode){
        System.out.println("No coin is Inserted");
    }
}