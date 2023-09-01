package PaymentType;

import Files.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Cash extends Payment {

    @Override
    public  void pay(int amount) {
        // Save the payment information to a file
        cashPayments.addElement(amount);
    }
}