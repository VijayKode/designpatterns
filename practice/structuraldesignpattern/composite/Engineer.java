package practice.structuraldesignpattern.composite;

public class Engineer implements Employee {

    private final String id;
    private final String name;
    private final String type;

    public Engineer(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    @Override
    public String getDetails() {
        return "Engineer {" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
