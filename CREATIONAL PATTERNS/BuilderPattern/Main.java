class Main{
    public static void main(String[] args){
        BuilderPattern bp = new BuilderPattern.Builder()
                            .setFirstName("Vineel")
                            .setAge(22)
                            .setCompany("Optum")
                            .setLastName("Pynam")
                            .setJobLocation("Hyderabad")
                            .setSalary(800000)
                            .build();

        System.out.println(bp.toString());
        System.out.println();

        BuilderPattern bp1 = new BuilderPattern.Builder()
                            .setFirstName("Haffezul Kareem")
                            .setAge(22)
                            .setCompany("Yellow.ai")
                            .setJobLocation("Banglore")
                            .build();
                            
        System.out.println(bp1.toString());
    }

}