package model.entity;

public class Insurance {

    private Long id;

    private Customer customer;

    private Vehicle vehicle;

    private double insuranceAmount;

    public Insurance(Long id, Customer customer, Vehicle vehicle, double insuranceAmount) {
        this.id = id;
        this.customer = customer;
        this.vehicle = vehicle;
        this.insuranceAmount = insuranceAmount;
    }

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    private void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    private void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(double insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }
}
