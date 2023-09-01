package PaymentType;

import Files.FileManager;

import java.util.Vector;

public abstract class Payment {

    public static Vector<Integer> cashPayments;
    public static Vector<Integer> visaPayments;

    public Payment(){
        cashPayments = FileManager.readCashPayments();
        visaPayments = FileManager.readVisaPayments();
    }
    public abstract  void pay(int amount);
}