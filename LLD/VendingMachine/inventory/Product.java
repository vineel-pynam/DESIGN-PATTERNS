package inventory;

public class Product{

    private Integer id;
    private Integer price;
    private String name;

    public Product(int id, int price, String name){
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public Integer getPrice(){
        return this.price;
    }

    public Integer getId(){
        return this.id;
    }
}