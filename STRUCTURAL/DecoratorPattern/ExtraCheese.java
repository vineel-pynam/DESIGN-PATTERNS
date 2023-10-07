class ExtraCheese extends Decorator{

    private Integer extraCheeseCost = 0;

    public ExtraCheese(FoodItem foodItem, Integer cost){
        super(foodItem);
        this.extraCheeseCost = cost;
    }

    @Override
    public String getDescription(){
        return foodItem.getDescription() + " with extra cheese";
    }

    @Override
    public Integer getCost(){
        return foodItem.getCost() + extraCheeseCost;
    }
}