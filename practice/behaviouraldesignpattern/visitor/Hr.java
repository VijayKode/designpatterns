package practice.behaviouraldesignpattern.visitor;

import practice.behaviouraldesignpattern.visitor.impl.CompleteRoleDetails;
import practice.behaviouraldesignpattern.visitor.impl.Manager;
import practice.behaviouraldesignpattern.visitor.impl.SoftwareEngineer;

public class Hr {
    public static void main(String[] args) {
        Employee employee = new SoftwareEngineer();
        employee.accept(new CompleteRoleDetails());

        employee = new Manager();
        employee.accept(new CompleteRoleDetails());
    }
}
