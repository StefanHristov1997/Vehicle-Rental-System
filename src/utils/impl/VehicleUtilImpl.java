package utils.impl;

import messages.offers.CarOffers;
import messages.offers.CargoVanOffers;
import messages.offers.MotorcycleOffers;
import model.entity.Car;
import model.entity.CargoVan;
import model.entity.Motorcycle;
import model.entity.Vehicle;
import model.enums.VehicleType;
import utils.VehicleUtil;

public class VehicleUtilImpl implements VehicleUtil {

    @Override
    public Vehicle createCarVehicle(String chosenVehicle) {

        Vehicle vehicle = null;

        switch (chosenVehicle) {
            case CarOffers.PORSCHE ->
                    vehicle = new Car(1L, VehicleType.CAR, CarOffers.PORSCHE, CarOffers.MODEL_SS, CarOffers.PORSCHE_MODEL_SS_VALUE, CarOffers.PORSCHE_MODEL_SS_SAFETY_RATING);
            case CarOffers.FIAT ->
                    vehicle = new Car(1L, VehicleType.CAR, CarOffers.FIAT, CarOffers.PUNTO, CarOffers.FIAT_PUNTO_VALUE, CarOffers.FIAT_PUNTO_SAFETY_RATING);
            case MotorcycleOffers.Aprilia -> vehicle = new Motorcycle(1L, VehicleType.MOTORCYCLE,
                    MotorcycleOffers.Aprilia, MotorcycleOffers.TUAREG, MotorcycleOffers.APRILIA_TUAREG_VALUE);
            case MotorcycleOffers.KAWASAKI -> vehicle = new Motorcycle(1L, VehicleType.MOTORCYCLE,
                    MotorcycleOffers.KAWASAKI, MotorcycleOffers.Z_650_RS, MotorcycleOffers.KAWASAKI_Z_650_RS_VALUE);
            case CargoVanOffers.FORD -> vehicle = new CargoVan(1L, VehicleType.CARGO_VAN,
                    CargoVanOffers.FORD, CargoVanOffers.TRANSIT, CargoVanOffers.FORD_TRANSIT_VALUE);
            case CargoVanOffers.RAM -> vehicle = new CargoVan(1L, VehicleType.CARGO_VAN,
                    CargoVanOffers.RAM, CargoVanOffers.ProMaster, CargoVanOffers.RAM_PROMASTER_VALUE);
        }

        return vehicle;
    }
}
