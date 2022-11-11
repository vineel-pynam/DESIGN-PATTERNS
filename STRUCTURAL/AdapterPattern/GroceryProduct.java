public class GroceryProduct implements GroceryItem{
    private String name;
    private String price;
    private String shopName;

    public GroceryProduct(String name, String price, String shopName){
        this.name = name;
        this.price = price;
        this.shopName = shopName;
    }

    @Override
    public String getGroceryItemName(){
        return name;
    }

    @Override
    public String getGroceryItemPrice(){
        return price;
    }

    @Override
    public String getGroceryShopName(){
        return shopName;
    }
}