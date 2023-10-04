public abstract class PersonBuilder {
    protected Person person = new Person();

    public Person getPerson(){
        return person;
    }

    public abstract void buildName();
    public abstract void buildAge();
    public abstract void buildWeight();
    public abstract void buildHeight();
}
