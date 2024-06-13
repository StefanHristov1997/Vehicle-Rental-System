package model.entity;

import java.time.LocalDate;

public class Invoice {

    private Long id;

    private LocalDate invoiceDate;

    private Long customerId;

    private Long rentId;

    private Long vehicleId;

    private double rentalAmount;

    private double insuranceAmount;

    private double totalAmount;

    public Invoice(LocalDate invoiceDate, Long id, Long rentId, Long customerId, Long vehicleId, double rentalAmount, double insuranceAmount, double totalAmount) {
        this.invoiceDate = invoiceDate;
        this.id = id;
        this.rentId = rentId;
        this.customerId = customerId;
        this.vehicleId = vehicleId;
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

    public Long getCustomerId() {
        return customerId;
    }

    private void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getRentId() {
        return rentId;
    }

    private void setRentId(Long rentId) {
        this.rentId = rentId;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    private void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
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
