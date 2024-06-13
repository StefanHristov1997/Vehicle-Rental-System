package model.entity;

import java.time.LocalDate;

public class Invoice {

    private Long id;

    private LocalDate invoiceDate;

    private Customer customer;

    private Rent rent;

    private Vehicle vehicle;

    private double rentalAmount;

    private double insuranceAmount;

    private double totalAmount;

    public Invoice(Long id, LocalDate invoiceDate, Customer customer, Vehicle vehicle, Rent rent, double rentalAmount, double insuranceAmount, double totalAmount) {
        this.id = id;
        this.invoiceDate = invoiceDate;
        this.customer = customer;
        this.vehicle = vehicle;
        this.rent = rent;
        this.rentalAmount = rentalAmount;
        this.insuranceAmount = insuranceAmount;
        this.totalAmount = totalAmount;
    }

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    private void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    private void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Rent getRent() {
        return rent;
    }

    private void setRent(Rent rent) {
        this.rent = rent;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    private void setVehicleId(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getRentalAmount() {
        return rentalAmount;
    }

    private void setRentalAmount(double rentalAmount) {
        this.rentalAmount = rentalAmount;
    }

    public double getInsuranceAmount() {
        return insuranceAmount;
    }

    private void setInsuranceAmount(double insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    private void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
