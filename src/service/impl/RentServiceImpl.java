package service.impl;

import model.entity.Vehicle;
import service.RentService;

public class RentServiceImpl implements RentService {

    @Override
    public double calculatedRentPrice(Vehicle vehicle, double priceForWeek, double priceForMoreThanAWeek, int rentalPeriod, int actualRentalPeriod) {
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
