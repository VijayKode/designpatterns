package practice.behaviouraldesignpattern.visitor.impl;

import practice.behaviouraldesignpattern.visitor.Employee;
import practice.behaviouraldesignpattern.visitor.Visitor;

public class SoftwareEngineer implements Employee {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSoftwareEngineer(this);
    }

    @Override
    public String getDetails() {
        return "Software engineer";
    }

}
