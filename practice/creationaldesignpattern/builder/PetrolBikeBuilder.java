package practice.creationaldesignpattern.builder;

public class PetrolBikeBuilder implements BikeBuilder {

    private Bike bike;

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
    public void fixWheels() {
        System.out.println("Wheels fixed for electric bike.");
    }

    @Override
    public void fixEngine() {
        System.out.println("Engine fixed for petrol bike.");
    }

    @Override
    public void paintBike() {
        System.out.println("Paint done for petrol bike.");
    }

    @Override
    public Bike build() {
        return this.getBike();
    }

    public Bike getBike() {
        if(this.bike == null) {
            this.bike = new Bike();
        }
        this.bike.setType("Petrol");
        return this.bike;
    }

    public static BikeBuilder builder() {
        return new PetrolBikeBuilder();
    }
}
