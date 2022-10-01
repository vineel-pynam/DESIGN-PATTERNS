package inventory;

public class Product{
    private String name;
    private Integer price;
    private Integer id;

    public Product(String name, Integer id, Integer price){
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(Integer price){
        this.price = price;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public Integer getPrice(){
        return price;
    }

    public Integer getId(){
        return id;
    }

    public String toString(){
        return "Name: " + this.name + "\n"  +
               "Price: " + this.price + "\n" +
               "Id: " + this.id + "\n"
        ;
    }
}