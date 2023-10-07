class ExtraSpicy extends Decorator{
    private Integer extraSpicyCost;

    public ExtraSpicy(FoodItem foodItem, Integer cost){
        super(foodItem);
        this.extraSpicyCost = cost;
    }

    @Override
    public String getDescription(){
        return foodItem.getDescription() + " with extra spicy";
    }

    @Override
    public Integer getCost(){
        return foodItem.getCost() + extraSpicyCost;
    }
}