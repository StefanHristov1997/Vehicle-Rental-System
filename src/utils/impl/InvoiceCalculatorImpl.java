package utils.impl;

import model.entity.Invoice;
import utils.InvoiceCalculator;

public class InvoiceCalculatorImpl implements InvoiceCalculator {

    @Override
    public double calculateInvoice(Invoice invoice) {
        return invoice.getRentalAmount() + invoice.getInsuranceAmount();
    }
}
