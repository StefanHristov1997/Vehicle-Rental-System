package model.entity;

import model.enums.VehicleType;

public class Motorcycle extends Vehicle {

    private int driverAge;

    public Motorcycle(Long id, VehicleType type, String model, String brand, double value, double price) {
        super(id, type, model, brand, value, price);
    }


    public int getDriverAge() {
        return driverAge;
    }

    private void setDriverAge(int driverAge) {
        this.driverAge = driverAge;
    }
}
