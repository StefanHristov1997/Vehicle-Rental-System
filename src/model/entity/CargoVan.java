package model.entity;

import model.enums.VehicleType;

public class CargoVan extends Vehicle {

    private int driverExperience;

    public CargoVan(Long id, VehicleType type, String model, String brand, double value, double price) {
        super(id, type, model, brand, value, price);
    }


    public int getDriverExperience() {
        return driverExperience;
    }

    private void setDriverExperience(int driverExperience) {
        this.driverExperience = driverExperience;
    }
}
