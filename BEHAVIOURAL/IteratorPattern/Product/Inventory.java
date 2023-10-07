import java.util.*;

public class Inventory{
    List<Product> products = new ArrayList<Product>();

    public Inventory() {
    }


    public void add(Product product){
        products.add(product);
    }

    public Iterator createIterator(){
        return new ProductIterator(products);
    }
}