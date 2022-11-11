import java.util.*;

class Main{
    public static void main(String args[]){
        List<Item> swiggyStore = new ArrayList<>();

        Item popcorn = new FoodItem("Popcorn", "200", "Popi Restraunt");
        Item biriyani = new FoodItem("Biriyani", "500", "Andhra Restraunt");
        Item groundNuts = new GroceryAdapter(new GroceryProduct("GroundNut", "100", "GroundNut Shop"));

        swiggyStore.add(popcorn);
        swiggyStore.add(biriyani);
        swiggyStore.add(groundNuts);

        swiggyStore.forEach( item -> System.out.println(item.getItemName()) );
    }
}