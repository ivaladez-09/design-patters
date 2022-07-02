package prototype;

public class Car extends Vehicle {
    private int topSpeed;

    public Car() {
    }

    public Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }
}
