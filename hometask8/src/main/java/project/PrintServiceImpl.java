package project;

public class PrintServiceImpl implements PrintService {
    public void printSalary(Employee employee) {
        System.out.println(employee.getSalary());
    }
}
