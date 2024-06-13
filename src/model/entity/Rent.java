package model.entity;

import java.time.LocalDate;

public class Rent {

    private Customer customer;

    private Vehicle vehicle;

    private LocalDate rentDate;

    private LocalDate returnDate;

    private LocalDate actualReturnDate;

    private int rentalPeriod;

    private int actualRentalPeriod;

    public Rent(Customer customer, Vehicle vehicle, LocalDate rentDate, LocalDate returnDate, LocalDate actualReturnDate, int rentalPeriod, int actualRentalPeriod) {
        this.customer = customer;
        this.setVehicle(vehicle);
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

        double rentPrice;

        switch (vehicle.getType()) {
            case CAR:
                rentPrice = calculatedRentPrice(vehicle, 20, 15, rentalPeriod, actualRentalPeriod);
                vehicle.setPrice(rentPrice);
                break;
            case MOTORCYCLE:
                rentPrice = calculatedRentPrice(vehicle, 15, 10, rentalPeriod, actualRentalPeriod);
                vehicle.setPrice(rentPrice);
                break;
            case CARGO_VAN:
                 rentPrice = calculatedRentPrice(vehicle, 50, 40, rentalPeriod, actualRentalPeriod);
                break;
        }

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

    private static double calculatedRentPrice(Vehicle vehicle, double priceForWeek, double priceForMoreThanAWeek, int rentalPeriod, int actualRentalPeriod) {
        double priceForRent;

        if (rentalPeriod < 7) {
            priceForRent = priceForWeek;
        } else {
            priceForRent = priceForMoreThanAWeek;
        }

        if (rentalPeriod != actualRentalPeriod) {
            final int remainingDays = rentalPeriod - actualRentalPeriod;
            priceForRent = (vehicle.getPrice() * actualRentalPeriod) + ((vehicle.getPrice() * 0.5) * remainingDays);
        }

        return priceForRent;
    }
}
