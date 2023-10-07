class Employee implements EmployeeComponent{

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void dispayInfo(){
        System.out.println(" Employee: " + name + " ----- Salary: " + salary);
    }

    @Override
    public int calculateSalary(){
        return salary;
    }
}