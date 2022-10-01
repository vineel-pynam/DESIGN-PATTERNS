package vendingmachine;

import inventory.Inventory;
import inventory.Product;
import states.State;
import states.CoinInsertedState;
import states.NoCoinInsertedState;
import states.DispenseState;
import java.io.*;

public class VendingMachine{
    private Inventory inventory;
    private NoCoinInsertedState noCoinInsertedState;
    private CoinInsertedState coinInsertedState;
    private DispenseState dispenseState;
    private State state;
    private static final Integer RACKS_COUNT = 2;
    private Integer amount;

    public VendingMachine(){
        this.noCoinInsertedState = new NoCoinInsertedState(this);
        this.coinInsertedState = new CoinInsertedState(this);
        this.dispenseState = new DispenseState(this);
        this.state = noCoinInsertedState;
        this.inventory = new Inventory(RACKS_COUNT);
        this.amount = 0;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return this.state;
    }

    public State getCoinInsertedState(){
        return this.coinInsertedState;
    }

    public State getNoCoinInsertedState(){
        return this.noCoinInsertedState;
    }

    public State getDispenseState(){
        return this.dispenseState;
    }

    public void setAmount(Integer amount){
        this.amount = amount;
    }

    public Integer getAmount(){
        return amount;
    }

    public void insertCoin(Integer amount){
        state.insertCoin(amount);
    }

    public void pressButton(int productCode){
        state.pressButton(productCode);
    }

    public void dispenseProduct(int productCode){
        state.dispenseProduct(productCode);
    }

    public boolean isProductAvailable(int productCode){
        return inventory.isProductAvailable(productCode);
    }

    public boolean hasSufficientAmount(int amount){
        return this.amount < amount;
    }

    public void reduceProductCount(int productCode){
        inventory.reduceProductCount(productCode);
    }

    public void addProduct(Product product){
        inventory.addProduct(product);
    }

     public Product getProduct(Integer productCode){
        Product product = inventory.getProduct(productCode);
        return product;
     }
}