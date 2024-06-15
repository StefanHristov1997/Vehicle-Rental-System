package model.entity;

import model.enums.VehicleType;

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

    public Invoice(Long id, LocalDate invoiceDate, Customer customer, Vehicle vehicle, Rent rent, double rentalAmount, double insuranceAmount) {
        this.id = id;
        this.invoiceDate = invoiceDate;
        this.customer = customer;
        this.vehicle = vehicle;
        this.rent = rent;
        this.rentalAmount = rentalAmount;
        this.insuranceAmount = insuranceAmount;
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

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append("***************************").append(System.lineSeparator());
        sb.append("Date: ").append(invoiceDate).append(System.lineSeparator());
        sb.append("Customer name: ").append(customer.getFullName()).append(System.lineSeparator());
        sb.append("Rented Vehicle: ").append(vehicle.getBrandAndModel()).append(System.lineSeparator());

        sb.append(System.lineSeparator());

        sb.append("Reservation start date: ").append(rent.getRentDate()).append(System.lineSeparator());
        sb.append("Reservation end date: ").append(rent.getReturnDate()).append(System.lineSeparator());
        sb.append("Reserved rental days: ").append(rent.getRentalPeriod()).append(System.lineSeparator());

        sb.append(System.lineSeparator());

        sb.append("Actual Return date: ").append(rent.getActualReturnDate()).append(System.lineSeparator());
        sb.append("Actual Rental days: ").append(rent.getActualRentalPeriod()).append(System.lineSeparator());

        sb.append(System.lineSeparator());

        if (rent.getActualRentalPeriod() < 7) {
            sb.append(String.format("Rental cost per day: $%.2f", vehicle.getRentalPricePerDay())).append(System.lineSeparator());
        } else {
            sb.append(String.format("Rental cost per day: $%.2f", vehicle.getRentalPriceWithDiscount())).append(System.lineSeparator());
        }

        sb.append(String.format("Initial insurance per day: $%.2f", vehicle.getInsurancePricePerDay())).append(System.lineSeparator());

        if (vehicle.getType().equals(VehicleType.MOTORCYCLE)) {

            if (customer.getAge() < 25) {
                sb.append(String.format("Insurance addition per day: $%.2f", vehicle.getInsurancePriceWithDiscount())).append(System.lineSeparator());
                sb.append(String.format("Insurance per day: $%.2f", vehicle.getInsurancePricePerDay() + vehicle.getInsurancePriceWithDiscount())).append(System.lineSeparator());
            }

        } else if (vehicle.getType().equals(VehicleType.CAR)) {
            Car car = (Car) vehicle;

            if ((car.getSafetyRating() > 3)) {
                sb.append(String.format("Initial discount per day: $%.2f", vehicle.getInsurancePriceWithDiscount())).append(System.lineSeparator());
                sb.append(String.format("Insurance per day: $%.2f", vehicle.getInsurancePricePerDay() - vehicle.getInsurancePriceWithDiscount())).append(System.lineSeparator());
            }
        } else {

            if (customer.getDriveExperience() > 5) {
                sb.append(String.format("Initial discount per day: $%.2f", vehicle.getInsurancePriceWithDiscount())).append(System.lineSeparator());
                sb.append(String.format("Insurance per day: $%.2f", vehicle.getInsurancePricePerDay() - vehicle.getInsurancePriceWithDiscount())).append(System.lineSeparator());
            }
        }


        if ((rent.getRentalPeriod() != rent.getActualRentalPeriod()) && rent.getActualRentalPeriod() > 7) {
            sb.append(System.lineSeparator());
            sb.append(String.format("Early return discount for rent: $%.2f", (rent.getRentalPeriod() * vehicle.getRentalPriceWithDiscount()) - getRentalAmount())).append(System.lineSeparator());
            sb.append(String.format("Early return discount for insurance: $%.2f", (rent.getRentalPeriod() * (vehicle.getInsurancePricePerDay() - vehicle.getInsurancePriceWithDiscount()) - getInsuranceAmount()))).append(System.lineSeparator());
        }

        sb.append(System.lineSeparator());

        sb.append(String.format("Total rent: $%.2f", getRentalAmount())).append(System.lineSeparator());
        sb.append(String.format("Total insurance: $%.2f", getInsuranceAmount())).append(System.lineSeparator());
        sb.append(String.format("Total: $%.2f", getTotalAmount())).append(System.lineSeparator());
        sb.append("***************************").append(System.lineSeparator());

        return sb.toString().trim();
    }
}
