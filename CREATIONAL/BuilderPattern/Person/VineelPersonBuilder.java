public class VineelPersonBuilder extends PersonBuilder{
    @Override
    public void buildName(){
        person.setName("Vineel");
    }

    @Override
    public void buildAge(){
        person.setAge(23);
    }

    @Override
    public void buildWeight(){
        person.setWeight("65 kg");
    }

    @Override
    public void buildHeight(){
        person.setHeight(5.5);
    }
}
