import messages.customer.MessagesToCustomer;
import messages.offers.CarOffers;
import messages.offers.CargoVanOffers;
import messages.offers.MotorcycleOffers;
import model.entity.*;
import model.enums.VehicleType;
import utils.*;
import utils.impl.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);

        final RentCalculator rentCalculator = new RentCalculatorImpl();
        final InsuranceCalculator insuranceCalculator = new InsuranceCalculatorImpl();
        final InvoiceCalculator invoiceCalculator = new InvoiceCalculatorImpl();
        final PrintUtil printUtil = new PrintUtilImpl();
        final ValidatorUtil validator = new ValidatorUtilImpl();
        final CustomerUtil customerUtil = new CustomerUtilImpl();
        final VehicleUtil vehicleUtil = new VehicleUtilImpl();
        final InvoiceUtil invoiceUtil = new InvoiceUtilImpl();
        final RentUtil rentUtil = new RentUtilImpl();

        printUtil.sendToCustomer(
                List.of(MessagesToCustomer.HELLO_CUSTOMER,
                        MessagesToCustomer.WELCOME_TO_OUR_SYSTEM,
                        MessagesToCustomer.SELECT_VEHICLE_TYPE));

        String vehicleType = validator.validateVehicleType(
                VehicleType.CAR.toString(),
                VehicleType.MOTORCYCLE.toString(),
                VehicleType.CARGO_VAN.toString(), sc);

        Customer customer = customerUtil.createCustomer(vehicleType, sc);

        Vehicle vehicle = null;

        switch (vehicleType) {
            case "CAR" -> {
                printUtil.sendToCustomer(
                        List.of(String.format(MessagesToCustomer.SELECT_VEHICLE,
                                VehicleType.CAR,
                                CarOffers.PORSCHE,
                                CarOffers.MODEL_SS,
                                CarOffers.FIAT,
                                CarOffers.PUNTO)));

                String chosenCar = validator.validateVehicle(
                        CarOffers.PORSCHE,
                        CarOffers.FIAT,
                        sc);

                vehicle = vehicleUtil.createCarVehicle(chosenCar);
            }
            case "MOTORCYCLE" -> {
                printUtil.sendToCustomer(
                        List.of(String.format(MessagesToCustomer.SELECT_VEHICLE,
                                VehicleType.MOTORCYCLE,
                                MotorcycleOffers.Aprilia,
                                MotorcycleOffers.TUAREG,
                                MotorcycleOffers.KAWASAKI,
                                MotorcycleOffers.Z_650_RS)));

                String chosenMotorCycle = validator.validateVehicle(
                        MotorcycleOffers.Aprilia,
                        MotorcycleOffers.KAWASAKI,
                        sc);

                vehicle = vehicleUtil.createCarVehicle(chosenMotorCycle);
            }
            case "CARGO_VAN" -> {
                printUtil.sendToCustomer(
                        List.of(String.format(MessagesToCustomer.SELECT_VEHICLE,
                                VehicleType.CARGO_VAN,
                                CargoVanOffers.FORD,
                                CargoVanOffers.TRANSIT,
                                CargoVanOffers.RAM,
                                CargoVanOffers.ProMaster)));

                String chosenCargoVan = validator.validateVehicle(
                        CargoVanOffers.FORD,
                        CargoVanOffers.RAM,
                        sc);

                vehicle = vehicleUtil.createCarVehicle(chosenCargoVan);
            }
        }

        printUtil.sendToCustomer(List.of(MessagesToCustomer.RENT_PERIOD));
        int rentPeriod = sc.nextInt();

        LocalDate rentDate = LocalDate.now();
        LocalDate returnDate = rentDate.plusDays(rentPeriod);

        printUtil.sendToCustomer(List.of(MessagesToCustomer.ACTUAL_RENT_PERIOD));

        Rent rent = rentUtil.createRent(sc, printUtil, rentPeriod, returnDate, customer, vehicle, rentDate);

        Insurance insurance = new Insurance(1L, customer, vehicle);

        Invoice invoice = invoiceUtil.createInvoice(invoiceCalculator, rentCalculator, insuranceCalculator, vehicle, rent, customer);

        printUtil.sendToCustomer(List.of(MessagesToCustomer.INVOICE, invoice.toString()));
    }
}
