package model.entity;

public class Vehicle {

    private Long id;

    private String brand;

    private String model;

    private double value;

    public Vehicle(Long id, String model, String brand, double value) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
