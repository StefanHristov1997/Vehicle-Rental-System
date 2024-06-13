package model.entity;

public class CargoVan extends Vehicle {

    private int driverExperience;

    public CargoVan(Long id, String model, String brand, double value, int driverExperience) {
        super(id, model, brand, value);
        this.driverExperience = driverExperience;
    }

    public int getDriverExperience() {
        return driverExperience;
    }

    public void setDriverExperience(int driverExperience) {
        this.driverExperience = driverExperience;
    }
}
