public class PersonDirector {
    public static Person build(PersonBuilder personBuilder){
        personBuilder.buildAge();
        personBuilder.buildName();
        personBuilder.buildHeight();
        personBuilder.buildWeight();

        return personBuilder.getPerson();
    }
}
