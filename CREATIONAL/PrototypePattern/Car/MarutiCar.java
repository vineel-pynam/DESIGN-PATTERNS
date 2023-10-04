public class MarutiCar implements CarPrototype{
    private String name;
    private String engine;
    private String carType;

    public MarutiCar(String name, String engine, String carType) {
        this.name = name;
        this.engine = engine;
        this.carType = carType;
    }

    @Override
    public CarPrototype clone(){
        return new MarutiCar(name, engine, carType);
    }

    @Override
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Engine: " + engine);
        System.out.println("Type: " + carType);
    }


    @Override
    public void update(String name){
        this.name = name;
    }
}
