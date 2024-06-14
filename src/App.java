import messages.customer.MessagesToCustomer;
import messages.exception.ExceptionMessages;
import messages.offers.CarOffers;
import messages.offers.CargoVanOffers;
import messages.offers.MotorcycleOffers;
import model.entity.*;
import model.enums.VehicleType;
import utils.RentCalculator;
import utils.impl.RentCalculatorImpl;

import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);

        final RentCalculator rentCalculator = new RentCalculatorImpl();

        System.out.println(MessagesToCustomer.HELLO_CUSTOMER);
        System.out.println(MessagesToCustomer.WELCOME_TO_OUR_SYSTEM);
        System.out.println(MessagesToCustomer.SELECT_VEHICLE_TYPE);

        String vehicleType = validateVehicleType(
                VehicleType.CAR.toString(),
                VehicleType.MOTORCYCLE.toString(),
                VehicleType.CARGO_VAN.toString(), sc);

        Customer customer = createCustomer(vehicleType, sc);

        Vehicle vehicle = null;

        switch (vehicleType) {
            case "CAR" -> {
                printCarOffers();

                String chosenCar = validateVehicle(
                        CarOffers.FORD,
                        CarOffers.FIAT,
                        sc);

                vehicle = createCarVehicle(chosenCar);
            }
            case "MOTORCYCLE" -> {
                printMotorcycleOffers();

                String chosenMotorCycle = validateVehicle(
                        MotorcycleOffers.Aprilia,
                        MotorcycleOffers.KAWASAKI,
                        sc);

                vehicle = createMotorcycleVehicle(chosenMotorCycle);
            }
            case "CARGO_VAN" -> {
                printCargoVanOffers();

                String chosenCargoVan = validateVehicle(
                        CargoVanOffers.FORD,
                        CargoVanOffers.RAM,
                        sc);

                vehicle = createCargoVehicle(chosenCargoVan);
            }
        }

        System.out.println(MessagesToCustomer.RENT_PERIOD);
        int rentPeriod = sc.nextInt();

        LocalDate rentDate = LocalDate.now();
        LocalDate returnDate = rentDate.plusDays(rentPeriod);

        System.out.print(MessagesToCustomer.ACTUAL_RENT_PERIOD);

        String answer = sc.nextLine().toUpperCase();

        Rent rent = null;

        if (answer.equalsIgnoreCase("Y")) {
            System.out.println(MessagesToCustomer.REDUCE_RENT_PERIOD);
            int actualRentalPeriod = rentPeriod - sc.nextInt();
            LocalDate actualReturnDate = returnDate.minusDays(actualRentalPeriod);
            rent = new Rent
                    (customer,
                            vehicle, rentDate, returnDate, actualReturnDate, rentPeriod, actualRentalPeriod);
        } else {
            rent = new Rent
                    (customer,
                            vehicle, rentDate, returnDate, returnDate, rentPeriod, rentPeriod);
        }


        double rentCost = rentCalculator.calculateRent(vehicle, rent);

        System.out.println(rentCost);
    }

    private static Vehicle createCargoVehicle(String chosenMotorCycle) {
        Vehicle vehicle;

        if (chosenMotorCycle.equals(CargoVanOffers.FORD)) {
            vehicle = new CargoVan(1L, VehicleType.CARGO_VAN,
                    CargoVanOffers.FORD, CargoVanOffers.TRANSIT, CargoVanOffers.FORD_TRANSIT_VALUE);
        } else {
            vehicle = new CargoVan(1L, VehicleType.CARGO_VAN,
                    CargoVanOffers.RAM, CargoVanOffers.ProMaster, CargoVanOffers.RAM_PROMASTER_VALUE);
        }
        return vehicle;
    }

    private static void printCargoVanOffers() {
        System.out.printf(MessagesToCustomer.SELECT_CARGO_VAN,
                CargoVanOffers.FORD,
                CargoVanOffers.TRANSIT,
                CargoVanOffers.RAM,
                CargoVanOffers.ProMaster);
    }

    private static Vehicle createMotorcycleVehicle(String chosenMotorCycle) {
        Vehicle vehicle;
        if (chosenMotorCycle.equals(MotorcycleOffers.Aprilia)) {
            vehicle = new Motorcycle(1L, VehicleType.MOTORCYCLE,
                    MotorcycleOffers.Aprilia, MotorcycleOffers.TUAREG, MotorcycleOffers.APRILIA_TUAREG_VALUE);
        } else {
            vehicle = new Motorcycle(1L, VehicleType.MOTORCYCLE,
                    MotorcycleOffers.KAWASAKI, MotorcycleOffers.Z_650_RS, MotorcycleOffers.KAWASAKI_Z_650_RS_VALUE);
        }
        return vehicle;
    }

    private static void printMotorcycleOffers() {
        System.out.printf(MessagesToCustomer.SELECT_MOTORCYCLE,
                MotorcycleOffers.Aprilia,
                MotorcycleOffers.TUAREG,
                MotorcycleOffers.KAWASAKI,
                MotorcycleOffers.Z_650_RS);
    }

    private static Vehicle createCarVehicle(String chosenCar) {

        Vehicle vehicle;

        if (chosenCar.equals(CarOffers.FORD)) {
            vehicle = new Car(1L, VehicleType.CAR, CarOffers.FORD, CarOffers.MUSTANG, CarOffers.FORD_MUSTANG_VALUE, CarOffers.FORD_SAFETY_RATING);
        } else {
            vehicle = new Car(1L, VehicleType.CAR, CarOffers.FIAT, CarOffers.PUNTO, CarOffers.FIAT_PUNTO_VALUE, CarOffers.FIAT_SAFETY_RATING);
        }

        return vehicle;
    }

    private static void printCarOffers() {
        System.out.printf(
                MessagesToCustomer.SELECT_CAR,
                CarOffers.FORD,
                CarOffers.MUSTANG,
                CarOffers.FIAT,
                CarOffers.PUNTO);
    }

    private static Customer createCustomer(String vehicleType, Scanner sc) {
        Customer customer = null;
        switch (vehicleType) {
            case "CAR" -> {
                System.out.println(MessagesToCustomer.GREETING_FOR_CHOICE_CAR);
                final String firstName = sc.nextLine();
                final String lastName = sc.nextLine();
                customer = new Customer(1L, firstName, lastName);
            }
            case "MOTORCYCLE", "CARGO_VAN" -> {
                System.out.println(MessagesToCustomer.GREETING_FOR_CHOICE_MOTOR_CARGO);
                final String firstName = sc.nextLine();
                final String lastName = sc.nextLine();
                final int age = sc.nextInt();
                final int drivenExperience = sc.nextInt();
                customer = new Customer(1L, firstName, lastName, age, drivenExperience);
            }
        }
        return customer;
    }

    private static String validateVehicleType(String car, String motorcycle, String cargoVan, Scanner sc) {

        String vehicleType = sc.nextLine().toUpperCase();

        while (!vehicleType.equals(car) && !vehicleType.equals(motorcycle) && !vehicleType.equals(cargoVan)) {
            System.out.println(ExceptionMessages.INVALID_VEHICLE_TYPE);
            vehicleType = sc.nextLine().toUpperCase();
        }
        return vehicleType;
    }


    private static String validateVehicle(String firstBrand, String secondBrand, Scanner sc) {

        String customerChoice = sc.nextLine().toUpperCase();

        while ((!customerChoice.equals(firstBrand)) && (!customerChoice.equals(secondBrand))) {
            System.out.println(ExceptionMessages.INVALID_VEHICLE);
            customerChoice = sc.nextLine().toUpperCase();
        }

        return customerChoice;
    }
}
