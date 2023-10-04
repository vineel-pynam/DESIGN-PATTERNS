public class VineelPersonBuilder extends PersonBuilder{

    public VineelPersonBuilder() {
        person = new Person();
    }

    @Override
    public PersonBuilder buildName(){
        person.setName("Vineel");
        return this;
    }

    @Override
    public PersonBuilder buildAge(){
        person.setAge(23);
        return this;
    }

    @Override
    public PersonBuilder buildWeight(){
        person.setWeight("65 kg");
        return this;
    }

    @Override
    public PersonBuilder buildHeight(){
        person.setHeight(5.5);
        return this;
    }
}
