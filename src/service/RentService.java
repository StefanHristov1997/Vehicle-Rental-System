package service;

import model.entity.Vehicle;

public interface RentService {

    double calculatedRentPrice(Vehicle vehicle, double priceForWeek, double priceForMoreThanAWeek, int rentalPeriod, int actualRentalPeriod);
}
