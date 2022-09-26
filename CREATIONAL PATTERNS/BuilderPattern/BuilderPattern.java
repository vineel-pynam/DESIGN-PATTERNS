
class BuilderPattern{
    private String firstName;
    private String lastName;
    private String jobLocation;
    private String company;
    private int age;
    private int salary;

    public BuilderPattern(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.jobLocation = builder.jobLocation;
        this.company = builder.company;
        this.age = builder.age;
        this.salary = builder.salary;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getJobLocation(){
        return this.jobLocation;
    }


    public String getCompany(){
        return this.company;
    }

    public int getAge(){
        return this.age;
    }

    public int getSalary(){
        return this.salary;
    }

    public String toString(){
        return "FirstName: " + this.firstName + "\n" +
               "LastName: " + this.lastName + "\n" +
               "JobLocation: " + this.jobLocation + "\n" +
               "Company: " + this.company + "\n" +
               "Age: " + this.age + "\n" +
               "Salary: " + this.salary;
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private String jobLocation;
        private String company;
        private int age;
        private int salary;

        public Builder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder setJobLocation(String jobLocation){
            this.jobLocation = jobLocation;
            return this;
        }


        public Builder setCompany(String company){
            this.company = company;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setSalary(int salary){
            this.salary = salary;
            return this;
        }

        public BuilderPattern build(){
            return new BuilderPattern(this);
        }
    }
}