package utils;

import model.entity.Insurance;
import model.entity.Rent;

public interface InvoiceCalculator {

    double calculateInvoice(Rent rent, Insurance insurance);
}
