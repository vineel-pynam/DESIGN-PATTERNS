class AmericanPizza implements FoodItem{
    @Override
    public String getDescription(){
        return "American Pizza";
    }

    @Override
    public Integer getCost(){
        return 200;
    }
}