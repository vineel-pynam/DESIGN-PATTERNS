public class PersonDirector {
    public static Person build(PersonBuilder personBuilder){
        return personBuilder.buildAge().buildName().buildHeight().buildWeight().build();
    }
}
