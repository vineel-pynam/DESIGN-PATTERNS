
import vending_machine.VendingMachine;
import inventory.*;

class Main{
    public static void main(String args[]){
        VendingMachine vendingMachine = new VendingMachine(3);

        Product coke = new Product(1, 20, "Coke");
        for( int i=0; i<3; i++ ) vendingMachine.addProduct(coke);

        Product pepsi = new Product(2, 15, "Pepsi");
        for( int i=0; i<3; i++ ) vendingMachine.addProduct(pepsi);

        Product fanta = new Product(3, 10, "Fanta");
        for( int i=0; i<3; i++ ) vendingMachine.addProduct(fanta);

        Product redBull = new Product(4, 10, "RedBull");
        for( int i=0; i<3; i++ ) vendingMachine.addProduct(redBull);

        System.out.println();

        vendingMachine.insertAmount(5);
        vendingMachine.pressButton(1);
        vendingMachine.insertAmount(10);
        vendingMachine.pressButton(2);

        vendingMachine.insertAmount(20);
        vendingMachine.pressButton(1);

        vendingMachine.insertAmount(25);
        vendingMachine.pressButton(2);
    
    }
}