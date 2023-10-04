public class TataCar implements CarPrototype{
    private String name;
    private String engine;
    private String carType;
    private String autoPilot;

    public TataCar(String name, String engine, String carType, String autoPilot) {
        this.name = name;
        this.engine = engine;
        this.carType = carType;
        this.autoPilot = autoPilot;
    }


    @Override
    public CarPrototype clone(){
        return new TataCar(name, engine, carType, autoPilot);
    }

    @Override
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Engine: " + engine);
        System.out.println("Type: " + carType);
        System.out.println("AutoPilot: " + autoPilot);

    }


    @Override
    public void update(String name){
        this.name = name;
    }
}
