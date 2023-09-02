package PaymentType;

import Files.CashManager;
import Files.VisaManager;

import java.util.Vector;

public abstract class Payment {

    public static Vector<Float> cashPayments;
    public static Vector<Float> visaPayments;

    public Payment(){
        cashPayments = CashManager.readCashPayments();
        visaPayments = VisaManager.readVisaPayments();
    }
    public abstract  void pay(float amount);
}