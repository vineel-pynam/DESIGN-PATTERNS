package state;

import vending_machine.VendingMachine;
import inventory.*;

public class DispenseProductdState extends State{

    private VendingMachine vendingMachine;
    private InventoryManager inventoryManager;
    public DispenseProductdState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
        this.inventoryManager = vendingMachine.getInventoryManager();
    }
    
    @Override
    public void dispenseProduct(Integer productCode){
        Product product  = inventoryManager.getProductAndReduceCount(productCode);
        int remainingAmount = vendingMachine.getAmount() - product.getPrice();

        System.out.println("Dispensing Product....");
        System.out.println("Product " + product.getName() + " has been dispensed!");
        System.out.println("Collect remaining Cash: " + remainingAmount);

        vendingMachine.generateBill(product);
        vendingMachine.setAmount(0);
        vendingMachine.setVendingMachineState(vendingMachine.getNoCoinInsertedState());

    }
}