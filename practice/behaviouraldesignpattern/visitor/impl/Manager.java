package practice.behaviouraldesignpattern.visitor.impl;

import lombok.Getter;
import lombok.Setter;
import practice.behaviouraldesignpattern.visitor.Employee;
import practice.behaviouraldesignpattern.visitor.Visitor;

import java.util.List;

@Setter
@Getter
public class Manager implements Employee {

    private List<String> reportee =
            List.of("Vijay","Teju","Noor");

    @Override
    public void accept(Visitor visitor) {
        visitor.visitManager(this);
    }

    @Override
    public String getDetails() {
        return "Manager";
    }
}
