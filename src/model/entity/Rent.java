package model.entity;

import service.RentService;
import service.impl.RentServiceImpl;

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

    private final RentService rentService;

    public Rent(Customer customer, Vehicle vehicle, LocalDate rentDate, LocalDate returnDate, LocalDate actualReturnDate, int rentalPeriod, int actualRentalPeriod) {
        this.customer = customer;
        this.rentService = new RentServiceImpl();
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
                rentPrice = rentService.calculatedRentPrice(vehicle, 20, 15, rentalPeriod, actualRentalPeriod);
                vehicle.setPrice(rentPrice);
                break;
            case MOTORCYCLE:
                rentPrice = rentService.calculatedRentPrice(vehicle, 15, 10, rentalPeriod, actualRentalPeriod);
                vehicle.setPrice(rentPrice);
                break;
            case CARGO_VAN:
                rentPrice = rentService.calculatedRentPrice(vehicle, 50, 40, rentalPeriod, actualRentalPeriod);
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

}
