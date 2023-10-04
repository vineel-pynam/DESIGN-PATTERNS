public class HafeezPersonBuilder extends PersonBuilder{

    public HafeezPersonBuilder() {
        person = new Person();
    }

    @Override
    public PersonBuilder buildName(){
        person.setName("Hafeez");
        return this;
    }

    @Override
    public PersonBuilder buildAge(){
        person.setAge(23);
        return this;
    }

    @Override
    public PersonBuilder buildWeight(){
        person.setWeight("60 kg");
        return this;
    }

    @Override
    public PersonBuilder buildHeight(){
        person.setHeight(6);
        return this;
    }
}
