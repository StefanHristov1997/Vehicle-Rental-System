package model.entity;

public class Insurance {

    private Long id;

    private Customer customer;

    private Vehicle vehicle;

    public Insurance(Long id, Customer customer, Vehicle vehicle) {
        this.id = id;
        this.customer = customer;
        this.vehicle = vehicle;
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

}
