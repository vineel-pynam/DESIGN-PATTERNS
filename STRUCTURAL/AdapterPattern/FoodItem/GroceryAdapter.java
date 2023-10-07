public class GroceryAdapter implements Item{
    private GroceryItem groceryItem;

    public GroceryAdapter(GroceryItem groceryItem){
        this.groceryItem = groceryItem;
    }

    @Override
    public String getItemName(){
        return groceryItem.getGroceryItemName();
    }

    @Override
    public String getItemPrice(){
        return groceryItem.getGroceryItemPrice();
    }

    @Override
    public String getRestrauntName(){
        return groceryItem.getGroceryShopName();
    }
}