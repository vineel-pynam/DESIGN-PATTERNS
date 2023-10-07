class IndianPizza implements FoodItem{
    @Override
    public String getDescription(){
        return "Indian Pizza";
    }

    @Override
    public Integer getCost(){
        return 150;
    }
}