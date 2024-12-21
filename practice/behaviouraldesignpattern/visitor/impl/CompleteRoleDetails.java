package practice.behaviouraldesignpattern.visitor.impl;

import practice.behaviouraldesignpattern.visitor.Employee;
import practice.behaviouraldesignpattern.visitor.Visitor;

public class CompleteRoleDetails implements Visitor {

    @Override
    public void visitSoftwareEngineer(Employee employee) {
        System.out.println(employee.getDetails());
        System.out.println("Account Details");
    }

    @Override
    public void visitManager(Employee employee) {
        System.out.println(employee.getDetails());
        System.out.println("Account Details");
        Manager  manager = (Manager) employee;
        System.out.println(manager.getReportee());
    }
}
