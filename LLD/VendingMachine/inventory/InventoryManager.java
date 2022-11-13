package inventory;

import java.util.*;

public class InventoryManager{

    private HashMap<Integer, Product> productStore;
    private HashMap<Integer, Integer> productsWithCount;
    private Queue<Integer> racksAvaible;

    public InventoryManager(Integer racksSize){
        this.productStore = new HashMap<Integer, Product>();
        this.productsWithCount = new HashMap<Integer, Integer>();
        this.racksAvaible = new LinkedList();

        for( Integer rack=1; rack <= racksSize; rack++ ){
            racksAvaible.add(rack);
        }
    }

    public void addProduct(Product product){
        int productId = product.getId();
        int availableProductCount = productsWithCount.getOrDefault(productId, 0);  
        if( availableProductCount == 0 ){
            if( racksAvaible.size() == 0 ){
                System.out.println("Inventory is Full!");
            }else{
                int productCode = racksAvaible.poll();
                productStore.put(productCode, product);
                productsWithCount.put(productId, 1);
                System.out.println("Added Product: " + product.getName());
            }
        }else{
            productsWithCount.put(productId, availableProductCount+1);
            System.out.println("Updated Product Count: " + (availableProductCount+1));

        }

        
    }

    public Product getProduct(Integer productCode){
        return productStore.get(productCode);
    }

    public Product getProductAndReduceCount(Integer productCode){
        Product product = productStore.get(productCode);
        int productId = product.getId();
        int count = productsWithCount.get(product.getId());
        if( count-1 != 0 ){
            productsWithCount.put(productId, count-1);
        }else{
            productsWithCount.remove(productId);
            productStore.remove(productCode);
            racksAvaible.add(productCode);
        }
        return product;
    }

    public boolean isProductAvailable(Integer productCode){
        return productsWithCount.getOrDefault(productCode, 0) == 0 ? false : true;  
    }

    public boolean isSufficientAmount(Integer productCode, Integer amount){
        Product product = productStore.get(productCode);
        return product.getPrice() <= amount;
    }



}