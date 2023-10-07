import java.util.*;

public class ProductIterator implements Iterator{
    List<Product> products;
    int currentIndex;

    public ProductIterator(List<Product> products){
        this.products = products;
        currentIndex = 0;
    }

    public Product next(){
        if( hasNext() ){
            return products.get(++currentIndex);
        }
        return null;
    }

    public boolean hasNext(){
        return currentIndex < products.size() - 1;
    }
}