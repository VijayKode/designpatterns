package practice.creationaldesignpattern.builder;

public class Customer {
    public static void main(String args[]) {
        BikeBuilder bikeBuilder =
                ElectricBikeBuilder.builder()
                        .setWheels("Alloy")
                        .setColor("Blue");

        BikeDirector bikeDirector = new BikeDirector();
        bikeDirector.setBikeBuilder(bikeBuilder);

        Bike bike = bikeDirector.buildBike();
        System.out.println(bike);

    }
}
