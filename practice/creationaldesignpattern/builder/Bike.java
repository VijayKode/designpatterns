package practice.creationaldesignpattern.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bike {
    String wheelType;
    String type;
    String color;

    @Override
    public String toString() {
        return "Bike{" +
                "wheelType='" + wheelType + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
