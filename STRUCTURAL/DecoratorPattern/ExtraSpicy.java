class ExtraSpicy extends PizzaDecorator{
    private Pizza pizza;

    public ExtraSpicy(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription(){
        return pizza.getDescription() + " with extra spicy";
    }

    @Override
    public Integer getCost(){
        return pizza.getCost() + 20;
    }
}