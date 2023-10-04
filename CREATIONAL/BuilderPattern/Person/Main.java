public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new HafeezPersonBuilder();
        Person person = PersonDirector.build(personBuilder);
        System.out.println(person);
    }
}
