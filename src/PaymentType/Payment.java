package PaymentType;

import Files.CashManager;
import Files.VisaManager;

import java.util.Vector;

public abstract class Payment {

    public static Vector<Integer> cashPayments;
    public static Vector<Integer> visaPayments;

    public Payment(){
        cashPayments = CashManager.readCashPayments();
        visaPayments = VisaManager.readVisaPayments();
    }
    public abstract  void pay(int amount);
}