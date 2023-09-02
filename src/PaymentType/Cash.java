package PaymentType;

import Files.CashManager;

public class Cash extends Payment {

    @Override
    public  void pay(float amount) {
        // Save the payment information to a file
        cashPayments.addElement(amount);
        CashManager.writeCashPayments();
    }
}