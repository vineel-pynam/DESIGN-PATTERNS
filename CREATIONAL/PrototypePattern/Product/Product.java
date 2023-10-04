public class Product implements ProductPrototype{
    private String name;
    private String price;

    public Product(String name, String price){
        this.name = name;
        this.price = price;
    }

    @Override
    public ProductPrototype clone(){
        return new Product(name, price);
    }

    @Override
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

}
