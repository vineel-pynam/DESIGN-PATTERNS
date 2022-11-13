package vending_machine;

import state.*;
import java.time.*;
import inventory.*;

public class VendingMachine{
    private Integer amount;
    private State state;
    private InventoryManager inventoryManager;
    private NoCoinInsertedState noCoinInsertedState;
    private CoinInsertedState coinInsertedState;
    private DispenseProductdState dispenseProductdState;

    public VendingMachine(Integer inventorySize){
        this.inventoryManager = new InventoryManager(inventorySize);
        this.noCoinInsertedState = new NoCoinInsertedState(this);
        this.coinInsertedState = new CoinInsertedState(this);
        this.dispenseProductdState = new DispenseProductdState(this);
        
        this.state = noCoinInsertedState;
        this.amount = 0;
    }

    public void setVendingMachineState(State state){
        this.state = state;
    }

    public State getNoCoinInsertedState(){
        return this.noCoinInsertedState;
    }

    public State getCoinInsertedState(){
        return this.coinInsertedState;
    }

    public State getDispenseProductdState(){
        return this.dispenseProductdState;
    }

    public void setAmount(Integer amount){
        this.amount = amount;
    }

    public Integer getAmount(){
        return this.amount;
    }

    public InventoryManager getInventoryManager(){
        return this.inventoryManager;
    }

    public void generateBill(Product product){
        System.out.println("--- Billing Information ---");
        System.out.println("Product Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Time: " + LocalDateTime.now() );
        System.out.println();
    }

    public void addProduct(Product product){
        inventoryManager.addProduct(product);
    }

    public void dispenseProduct(Integer productCode){
        this.state.dispenseProduct(productCode);
    }

    public void pressButton(Integer productCode){
        this.state.pressButton(productCode);
    }

    public void insertAmount(Integer amount){
        this.state.insertAmount(amount);
    }
}