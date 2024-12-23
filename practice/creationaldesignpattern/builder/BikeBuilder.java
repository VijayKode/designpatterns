package practice.creationaldesignpattern.builder;

public interface BikeBuilder {
    BikeBuilder setWheels(String wheels);
    BikeBuilder setColor(String color);
    void fixWheels();
    void fixEngine();
    void paintBike();
    Bike build();

}
