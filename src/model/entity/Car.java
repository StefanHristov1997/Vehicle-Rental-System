package model.entity;

public class Car extends Vehicle {

    private int safetyRating;

    public Car(Long id, String model, String brand, double value, int safetyRating) {
        super(id, model, brand, value);
        this.safetyRating = safetyRating;
    }

    public int getSafetyRating() {
        return safetyRating;
    }

    public void setSafetyRating(int safetyRating) {
        this.safetyRating = safetyRating;
    }
}
