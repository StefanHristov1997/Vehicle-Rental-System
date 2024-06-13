package model.entity;

public class Motorcycle extends Vehicle {

    private int driverAge;

    public Motorcycle(Long id, String model, String brand, double value, int driverAge) {
        super(id, model, brand, value);
        this.driverAge = driverAge;
    }

    public int getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(int driverAge) {
        this.driverAge = driverAge;
    }
}
