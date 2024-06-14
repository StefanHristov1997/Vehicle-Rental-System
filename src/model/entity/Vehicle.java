package model.entity;

import model.enums.VehicleType;

public class Vehicle {

    private Long id;

    private VehicleType type;

    private String brand;

    private String model;

    private double value;

    private double rentalPricePerDay;

    private double rentalPriceWithDiscount;

    private double insurancePricePerDay;

    public Vehicle(Long id, VehicleType type, String model, String brand, double value, double rentalPricePerDay,double rentalPriceWithDiscount, double insurancePricePerDay) {
        this.id = id;
        this.type = type;
        this.model = model;
        this.brand = brand;
        this.value = value;
        this.rentalPricePerDay = rentalPricePerDay;
        this.rentalPriceWithDiscount = rentalPriceWithDiscount;
        this.insurancePricePerDay = insurancePricePerDay;
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

    public VehicleType getType() {
        return type;
    }

    protected void setType(VehicleType type) {
        this.type = type;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    protected void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public double getInsurancePricePerDay() {
        return insurancePricePerDay;
    }

    protected void setInsurancePricePerDay(double insurancePricePerDay) {
        this.insurancePricePerDay = insurancePricePerDay;
    }

    public double getRentalPriceWithDiscount() {
        return rentalPriceWithDiscount;
    }

    public void setRentalPriceWithDiscount(double rentalPriceWithDiscount) {
        this.rentalPriceWithDiscount = rentalPriceWithDiscount;
    }
}
