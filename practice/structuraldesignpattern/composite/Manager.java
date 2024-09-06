package practice.structuraldesignpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

    private List<Employee> reporters;
    private final String name;
    private final String id;
    public Manager(String name, String id) {
        this.reporters = new ArrayList<>();
        this.name = name;
        this.id = id;
    }

    @Override
    public String getDetails() {
        return "Manager{" +
                "reporters=" + reporters +
                ", name='" + name + '\'' +
                '}';
    }

    public void addReporters(Employee employee) {
        reporters.add(employee);
    }

    public void removeReporters(Employee employee) {
        reporters.remove(employee);
    }

    public List<Employee> getReporters() {
        return reporters;
    }

}
