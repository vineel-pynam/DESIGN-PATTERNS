
import vendingmachine.VendingMachine;
import inventory.*;
import java.io.*;

public class Main{

    public static void main(String args[]){
        VendingMachine vendingMachine = new VendingMachine();

        Product coke = new Product("COKE", 1, 10);
        for( int i=1; i<=3; i++ ){
            vendingMachine.addProduct(coke);
        }

        Product red_bull = new Product("RED_BULL", 2, 100);
        for( int i=1; i<=3; i++ ){
            vendingMachine.addProduct(red_bull);
        }
 
        vendingMachine.insertCoin(10);
        vendingMachine.insertCoin(1);
        vendingMachine.pressButton(1);
        System.out.println();
        vendingMachine.insertCoin(50);
        vendingMachine.pressButton(2);
        System.out.println();
        vendingMachine.insertCoin(60);
        vendingMachine.pressButton(2);
        System.out.println();
    }
}