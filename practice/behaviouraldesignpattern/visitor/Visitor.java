package practice.behaviouraldesignpattern.visitor;

public interface Visitor {
    void visitSoftwareEngineer(Employee employee);
    void visitManager(Employee employee);
}
