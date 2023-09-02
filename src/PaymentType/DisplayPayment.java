package PaymentType;

import Files.CashManager;
import Files.DriverManager;
import Files.PassengerManager;

import java.util.Scanner;

public class DisplayPayment {
    public DisplayPayment(float totalTripPrice){
        Scanner scanner = new Scanner(System.in);

        Payment payment = new Visa();
        payment.pay(100);

        System.out.println("\t\t Enter how to pay");
        System.out.println("1 for cash, 2 for visa");

        int choice = scanner.nextInt();
        if(choice == 1){
            Payment cash = new Cash();
            cash.pay(totalTripPrice);
        } else if (choice == 2) {
            Payment visa = new Visa();
            visa.pay(totalTripPrice);
        }

        DriverManager.writeDrivers();
        PassengerManager.writePassengers();

        CashManager.writeCashPayments();

    }
}