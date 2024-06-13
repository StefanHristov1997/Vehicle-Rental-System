package model.entity;

import model.enums.VehicleType;

public class Car extends Vehicle {

    private int safetyRating;

    public Car(Long id, VehicleType type, String model, String brand, double value, double price) {
        super(id, type, model, brand, value, price);
    }

    public int getSafetyRating() {
        return safetyRating;
    }

    private void setSafetyRating(int safetyRating) {
        this.safetyRating = safetyRating;
    }
}
