package inventory;

import java.util.*;
import java.io.*;

public class Inventory{
    Map<Integer, Product> productCatalog;
    Map<Integer, Integer> productsWithCount;
    Queue<Integer> availableRacks;

    public Inventory(Integer racksSize){
        availableRacks = new LinkedList<>();

        for( Integer i=1; i<=racksSize; i++ ){
            availableRacks.add(i);
        }

        productCatalog = new HashMap<>();
        productsWithCount = new HashMap<>();
    }

    public void addProduct(Product product){
        Integer productId = product.getId();
        Integer productCount = productsWithCount.getOrDefault(productId, 0);

        if( productCount == 0 ){
            if( availableRacks.isEmpty() ){
                System.out.println("No Racks Available");
            }else{
                productCatalog.put(availableRacks.poll(), product);
                productsWithCount.put(productId, productCount+1);
            }
        }else{
            productsWithCount.put(productId, productCount+1);
        }
    }

    public Product getProduct(Integer productCode){
        return productCatalog.get(productCode);
    }

    public void reduceProductCount(Integer productCode){
        Product product = productCatalog.get(productCode);
        Integer productCount = productsWithCount.get(product.getId());

        if( (productCount-1) == 0 ){
            productCatalog.remove(productCode);
            productsWithCount.remove(product.getId());
            availableRacks.add(product.getId());
        }else{
            productsWithCount.put(product.getId(), productCount-1);
        }   
    }

    public boolean isProductAvailable(int productCode){
        Product product = productCatalog.get(productCode);
        return productsWithCount.get(product.getId()) > 0;
    }

}