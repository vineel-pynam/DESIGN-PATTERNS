class IndianPizza extends Pizza{
    @Override
    public String getDescription(){
        return "Indian Pizza";
    }

    @Override
    public Integer getCost(){
        return 150;
    }
}