public class Main{
    public static void main(String args[]){
        Product product1 = new Product("Apple", 120);
        Product product2 = new Product("Banana", 70);
        Product product3 = new Product("Orange", 50);
        Product product4 = new Product("Avacado", 200);


        Inventory inventory = new Inventory();
        inventory.add(product1);
        inventory.add(product3);
        inventory.add(product2);
        inventory.add(product4);

        Iterator iterator = inventory.createIterator();
        Product product = iterator.next();

        while( product != null ){
            product.display();
            product = iterator.next();
        }
    }
}