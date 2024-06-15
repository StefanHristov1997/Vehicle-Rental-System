package model.entity;

import java.time.LocalDate;

public class Rent {

    private Long id;

    private Customer customer;

    private Vehicle vehicle;

    private LocalDate rentDate;

    private LocalDate returnDate;

    private LocalDate actualReturnDate;

    private int rentalPeriod;

    private int actualRentalPeriod;

    private  double rentalAmount;

    public Rent(Customer customer, Vehicle vehicle, LocalDate rentDate, LocalDate returnDate, LocalDate actualReturnDate, int rentalPeriod, int actualRentalPeriod) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.actualReturnDate = actualReturnDate;
        this.rentalPeriod = rentalPeriod;
        this.actualRentalPeriod = actualRentalPeriod;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    private void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getRentalPeriod() {
        return rentalPeriod;
    }

    private void setRentalPeriod(int rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }

    public Customer getCustomer() {
        return customer;
    }

    private void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    private void setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    private void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public LocalDate getActualReturnDate() {
        return actualReturnDate;
    }

    private void setActualReturnDate(LocalDate actualReturnDate) {
        this.actualReturnDate = actualReturnDate;
    }

    public int getActualRentalPeriod() {
        return actualRentalPeriod;
    }

    private void setActualRentalPeriod(int actualRentalPeriod) {
        this.actualRentalPeriod = actualRentalPeriod;
    }

    public double getRentalAmount() {
        return rentalAmount;
    }

    public void setRentalAmount(double rentalAmount) {
        this.rentalAmount = rentalAmount;
    }
}
