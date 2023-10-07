class Main{
    public static void main(String[] args){
        FoodItem indianPizza = new IndianPizza();
        System.out.println(indianPizza.getDescription());
        System.out.println(indianPizza.getCost());
        System.out.println();

        indianPizza = new ExtraSpicy(indianPizza, 20);
        System.out.println(indianPizza.getDescription());
        System.out.println(indianPizza.getCost());
        System.out.println();

        indianPizza = new ExtraCheese(indianPizza, 40);
        System.out.println(indianPizza.getDescription());
        System.out.println(indianPizza.getCost());

    }
}