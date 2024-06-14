import messages.customer.MessagesToCustomer;
import messages.exception.ExceptionMessages;
import messages.offers.CarOffers;
import model.entity.Car;
import model.entity.Customer;
import model.entity.Vehicle;
import model.enums.VehicleType;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);

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
                System.out.printf(
                        MessagesToCustomer.SELECT_CAR,
                        CarOffers.FORD,
                        CarOffers.MUSTANG,
                        CarOffers.FIAT,
                        CarOffers.PUNTO);

                List<String> chosenCar = validateCar(
                        CarOffers.FORD,
                        CarOffers.MUSTANG,
                        CarOffers.FIAT,
                        CarOffers.PUNTO, sc);

                String brand = chosenCar.getFirst();
                String model = chosenCar.get(1);

                if (brand.equals(CarOffers.FORD) && model.equals(CarOffers.MUSTANG)) {
                    vehicle = new Car(1L, VehicleType.CAR, brand, model, CarOffers.FORD_VALUE, CarOffers.FORD_SAFETY_RATING);
                } else {
                    vehicle = new Car(1L, VehicleType.CAR, brand, model, CarOffers.FIAT_VALUE, CarOffers.FIAT_SAFETY_RATING);
                }

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


    private static List<String> validateCar(String firstCarBrand, String firstCarModel, String secondCarBrand, String secondCarModel, Scanner sc) {

        List<String> customerChoice = Arrays.stream(sc.nextLine().toUpperCase().split("\\s+")).toList();

        while ((!customerChoice.getFirst().equals(firstCarBrand) && !customerChoice.get(1).equals(firstCarModel))
                && (!customerChoice.getFirst().equals(secondCarBrand) && !customerChoice.get(1).equals(secondCarModel))) {

            System.out.println(ExceptionMessages.INVALID_CAR);
            customerChoice = Arrays.stream(sc.nextLine().toUpperCase().split("\\s+")).toList();
        }

        return customerChoice;
    }
}
