public class FoodItem implements Item{
    private String name;
    private String price;
    private String restrauntName;

    public FoodItem(String name, String price, String restrauntName){
        this.name = name;
        this.price = price;
        this.restrauntName = restrauntName;
    }

    @Override
    public String getItemName(){
        return name;
    }

    @Override
    public String getItemPrice(){
        return price;
    }

    @Override
    public String getRestrauntName(){
        return restrauntName;
    }
}