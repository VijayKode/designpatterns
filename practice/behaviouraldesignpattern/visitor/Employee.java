package practice.behaviouraldesignpattern.visitor;

public interface Employee {
    void accept(Visitor Visitor);
    String getDetails();
}
