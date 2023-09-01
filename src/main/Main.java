package main;

import Files.*;
import PaymentType.Cash;
import PaymentType.Payment;
import PaymentType.Visa;
import Trip.requestRide;
import Trip.ridesTypes;
import Trip.totalTripPrice;
import registeration.*;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fileReader.readFiles();
        Scanner scanner = new Scanner(System.in);


        ///payment
        // Create a PaymentType.Visa payment object.
        Payment payment = new Visa();

        // Make a payment of $100.
        payment.pay(100);




        System.out.println("Enter 1 for registration OR 2 for request");
        int requestorregister = scanner.nextInt();

        System.out.println("1- for driver & 2- for passenger & 3- for login");
        int choose = scanner.nextInt();
        Driver driver = Driver.getInstance();

        Passenger passenger = Passenger.getInstance();

        if (choose == 1) {
            driver = Driver.getInstance();
        } else if (choose == 2) {
            passenger = Passenger.getInstance();
        }

        if (requestorregister == 1) {
            if (choose == 1)
                driver.registeration(driver);
            else if (choose == 2)
                passenger.registeration(passenger);

            ////

        } else if (requestorregister == 2) {
            //////
            requestRide requestRide = new requestRide();
            ridesTypes ridesT = new ridesTypes();
            totalTripPrice totalP = new totalTripPrice();

            String location, destination, ride;
            int choiceLoc, choiceDest, choiceRide;
            int tripConfirmation;
            int rideTypeConfirmation2;

            //price for distance
            requestRide.display(1);
            System.out.println("choose the location and the destination by the name or number.");
            // choosing location
            System.out.print("Location: ");
            if (scanner.hasNextInt()) {  // to make the user able to choose with numbers
                choiceLoc = scanner.nextInt();
                location = requestRide.locationList.get(choiceLoc - 1);
            } else {
                location = scanner.next();
            }

            // choosing destination
            requestRide.display(1);
            System.out.print("Destination: ");
            if (scanner.hasNextInt()) {  // to make the user able to choose with numbers
                choiceDest = scanner.nextInt();
                destination = requestRide.locationList.get(choiceDest - 1);
            } else {
                destination = scanner.next();
            }
            System.out.println("the price will be: " + requestRide.calculateRide(location, destination));
            System.out.println("type 1 to confirm, 0 cancel");
            tripConfirmation = scanner.nextInt();
            if (tripConfirmation == 1) {

                //price for the ride
                ridesT.display(1);
                System.out.println("choose type of ride you want by word or number");
                if (scanner.hasNextInt()) {  // to make the user able to choose with numbers
                    choiceRide = scanner.nextInt();
                    ride = ridesT.ridesList.get(choiceRide - 1);
                } else {
                    ride = scanner.next();
                }
                System.out.println("the total price will be: " + totalP.totalPrice(location, destination, ride));
                System.out.println("type 1 to confirm, 0 to cancel");
                rideTypeConfirmation2 = scanner.nextInt();
                if (rideTypeConfirmation2 == 1)
                    System.out.println("total price for the trip is: " + totalP.totalPrice(location, destination, ride));
                else {
                    System.out.println("\t \t -process canceled-");
                    main(args);
                }
            } else {
                System.out.println("\t \t -process canceled-");
                main(args);
            }
        }
        DriverManager.writeDrivers();
        PassengerManager.writePassengers();

        Payment cash = new Cash();
        Payment visa = new Visa();

        cash.pay(9);
        visa.pay(81);

        CashManager.writeCashPayments();

    }
}