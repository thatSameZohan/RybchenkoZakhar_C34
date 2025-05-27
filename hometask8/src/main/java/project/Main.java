package project;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alex", 1, Role.DEVELOPER);
        Employee employee2 = new EmployeeNew("Jason", 6, Role.TEAMLEAD);
        PrintService printService = new PrintServiceImpl();
        printService.printSalary(employee1);
        printService.printSalary(employee2);
    }
}
