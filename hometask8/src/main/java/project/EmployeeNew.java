package project;

public class EmployeeNew extends Employee {


    public EmployeeNew(String name, int exp, Role role) {
        super(name, exp, role);
    }

    public int getSalary() {
            int baseSalary = this.role.getBaseSalary();
            return baseSalary * 120 / 100 + baseSalary * this.exp / 10;
        }
}
