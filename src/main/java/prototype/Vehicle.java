package prototype;

public abstract class Vehicle {
    private String brand;
    private String model;
    private String color;

    public Vehicle() {
    }

    protected Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.color = vehicle.color;
    }

    public abstract Vehicle clone();
}
