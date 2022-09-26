class AmericanPizza extends Pizza{
    @Override
    public String getDescription(){
        return "American Pizza";
    }

    @Override
    public Integer getCost(){
        return 200;
    }
}