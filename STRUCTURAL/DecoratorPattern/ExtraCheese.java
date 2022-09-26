class ExtraCheese extends PizzaDecorator{
    private Pizza pizza;

    public ExtraCheese(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription(){
        return pizza.getDescription() + " with extra cheese";
    }

    @Override
    public Integer getCost(){
        return pizza.getCost() + 50;
    }
}