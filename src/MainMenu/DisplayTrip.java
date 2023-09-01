package MainMenu;
import Trip.requestRide;
import Trip.ridesTypes;
import Trip.totalTripPrice;
import main.*;
import registeration.*;
import login.*;

import java.util.Scanner;

public class DisplayTrip {
    DisplayTrip() {
        Scanner scanner = new Scanner(System.in);

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
        Object args;
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
                new Menu();
            }
        } else {
            System.out.println("\t \t -process canceled-");
            new Menu();
        }

    }
}
