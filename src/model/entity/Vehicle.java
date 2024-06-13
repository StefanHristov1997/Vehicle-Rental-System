package model.entity;

import model.enums.VehicleType;

public class Vehicle {

    private Long id;

    private VehicleType type;

    private String brand;

    private String model;

    private double value;

    private double price;

    public Vehicle(Long id, VehicleType type, String model, String brand, double value, double price) {
        this.id = id;
        this.type = type;
        this.model = model;
        this.brand = brand;
        this.value = value;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    protected void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    protected void setBrand(String brand) {
        this.brand = brand;
    }

    public double getValue() {
        return value;
    }

    protected void setValue(double value) {
        this.value = value;
    }

    public String getModel() {
        return model;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    public VehicleType getType() {
        return type;
    }

    protected void setType(VehicleType type) {
        this.type = type;
    }
}
