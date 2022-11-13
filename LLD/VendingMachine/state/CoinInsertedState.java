package state;

import vending_machine.VendingMachine;
import inventory.*;

public class CoinInsertedState extends State{

    private VendingMachine vendingMachine;
    private InventoryManager inventoryManager;
    public CoinInsertedState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
        this.inventoryManager = vendingMachine.getInventoryManager();
    }

    @Override
    public void insertAmount(Integer amount){
        vendingMachine.setAmount(vendingMachine.getAmount() + amount);
    }

    @Override
    public void pressButton(Integer productCode){
        boolean isProductAvailable = inventoryManager.isProductAvailable(productCode);
        boolean isSufficientAmount = inventoryManager.isSufficientAmount(productCode, vendingMachine.getAmount());

        if( !isProductAvailable ){
            System.out.println("Product Not Available...! Try Another Product");
        }else if( !isSufficientAmount ){
            System.out.println("Insufficient Amount! Add more money");
        }else{
            vendingMachine.setVendingMachineState(vendingMachine.getDispenseProductdState());
            vendingMachine.dispenseProduct(productCode);
        }
    }

}