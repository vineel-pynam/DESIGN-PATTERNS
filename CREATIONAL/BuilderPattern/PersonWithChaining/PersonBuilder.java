public abstract class PersonBuilder {
    protected Person person;

    public Person build(){
        return person;
    }

    public abstract PersonBuilder buildName();
    public abstract PersonBuilder buildAge();
    public abstract PersonBuilder buildWeight();
    public abstract PersonBuilder buildHeight();
}
