public class Person {
    private String name;
    private int age;
    private String weight;
    private double height;

    public Person() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWeight() {
        return this.weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    

    public String toString(){
        return "Name: " + this.name + "\n" +
                "Age: " + this.age + "\n" +
                "Weight: " + this.weight + "\n" +
                "Height: " + this.height + "\n";

    }
}
