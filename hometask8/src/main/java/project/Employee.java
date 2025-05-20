package project;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Employee {
    public String name;
    public int exp;
    public Role role;

    public int getSalary() {
        int baseSalary = this.role.getBaseSalary();
        return baseSalary + baseSalary * this.exp / 10;
    }

}
