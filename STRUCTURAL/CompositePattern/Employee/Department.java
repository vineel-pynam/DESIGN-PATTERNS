import java.util.*;

class Department implements EmployeeComponent{

    private String name;
    private List<EmployeeComponent> components;

    public Department(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addMember(EmployeeComponent component){
        components.add(component);
    }

    @Override
    public void dispayInfo(){
        System.out.println("Department: " + name);
        for( EmployeeComponent component : components){
            component.dispayInfo();
        }
    }

    @Override
    public int calculateSalary(){
        int totalSalary = 0;
        for( EmployeeComponent component : components){
            totalSalary += component.calculateSalary();
        }

        return totalSalary;
    }
}