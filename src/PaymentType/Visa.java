package PaymentType;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Visa extends Payment {

    @Override
    public void pay(int amount) {
        // Save the payment information to a file.
        // FileWriter to save the data That's Example : modify it to the calsses you named " Files Admin " !!!?
        visaPayments.addElement(amount);
    }
}
