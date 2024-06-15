package utils.impl;

import model.entity.Insurance;
import model.entity.Rent;
import utils.InvoiceCalculator;

public class InvoiceCalculatorImpl implements InvoiceCalculator {

    @Override
    public double calculateInvoice(Rent rent, Insurance insurance) {
        return rent.getRentalAmount() + insurance.getInsuranceAmount();
    }
}
