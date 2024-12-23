package practice.creationaldesignpattern.builder;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BikeDirector {
    private BikeBuilder bikeBuilder;

    public Bike buildBike() {
        bikeBuilder.fixWheels();
        bikeBuilder.fixEngine();
        bikeBuilder.paintBike();
        return bikeBuilder.build();
    }
}
