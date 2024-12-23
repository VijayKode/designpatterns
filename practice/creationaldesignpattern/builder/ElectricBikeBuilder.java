package practice.creationaldesignpattern.builder;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ElectricBikeBuilder implements BikeBuilder{

    private Bike bike;


    @Override
    public void fixWheels() {
        System.out.println("Wheels fixed for electric bike.");
    }

    @Override
    public void fixEngine() {
        System.out.println("Electric Engine is fixed.");
    }

    @Override
    public void paintBike() {
        System.out.println("Paint is done for electric vehicle.");
    }


    @Override
    public BikeBuilder setWheels(String wheels) {
        this.getBike().setWheelType(wheels);
        return this;
    }

    @Override
    public BikeBuilder setColor(String color) {
        this.getBike().setColor(color);
        return this;
    }

    @Override
    public Bike build() {
        return this.getBike();
    }

    public Bike getBike() {
        if(this.bike == null) {
            this.bike = new Bike();
        }
        this.bike.setType("Electric");
        return this.bike;
    }

    public static BikeBuilder builder() {
        return new ElectricBikeBuilder();
    }
}
