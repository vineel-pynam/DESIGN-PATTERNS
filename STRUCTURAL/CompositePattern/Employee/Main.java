class Main{
    public static void main(String args[]){
        Department department = new Department("CSE");

        Team team1 = new Team("Nibbles");
        Employee emp1 = new Employee("Vineel", 100000);
        Employee emp2 = new Employee("Suneel", 50000);

        Team team2 = new Team("Jerry");
        Employee emp3 = new Employee("Geethika", 40000);

        team2.addMember(emp3);
        team1.addMember(emp1);
        team1.addMember(emp2);

        department.addMember(team1);
        department.addMember(team2);

        department.dispayInfo();
        int totalSalary = department.calculateSalary();
        System.out.println("TotalSalary: " + totalSalary);

    }
}