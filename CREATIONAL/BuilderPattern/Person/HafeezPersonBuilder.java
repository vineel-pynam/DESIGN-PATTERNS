public class HafeezPersonBuilder extends PersonBuilder{
    @Override
    public void buildName(){
        person.setName("Hafeez");
    }

    @Override
    public void buildAge(){
        person.setAge(23);
    }

    @Override
    public void buildWeight(){
        person.setWeight("60 kg");
    }

    @Override
    public void buildHeight(){
        person.setHeight(6);
    }
}
