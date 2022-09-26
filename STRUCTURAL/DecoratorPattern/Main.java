class Main{
    public static void main(String[] args){
        Pizza pizza = new IndianPizza();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
        System.out.println();

        pizza = new ExtraSpicy(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
        System.out.println();

        pizza = new ExtraCheese(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

    }
}