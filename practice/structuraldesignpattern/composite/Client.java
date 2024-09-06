package practice.structuraldesignpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String args[]) {
        Employee emp = new Engineer("123", "Vijay", "engineer");

        List<Employee> reporters = new ArrayList<>();
        reporters.add(emp);

        Manager manager = new Manager("Mon", "133");
        manager.addReporters(emp);

        Employee employee = manager;

        System.out.println(emp.getDetails());
        System.out.println(employee.getDetails());
    }
}
