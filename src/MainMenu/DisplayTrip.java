package MainMenu;
import PaymentType.DisplayPayment;
import Trip.requestRide;
import Trip.ridesTypes;
import Trip.totalTripPrice;
import srt.ReviewAndRating;
import srt.Supporting;

import java.util.Scanner;

public class DisplayTrip {
    public DisplayTrip() {
        Scanner scanner = new Scanner(System.in);

        requestRide requestRide = new requestRide();
        ridesTypes ridesT = new ridesTypes();
        totalTripPrice totalP = new totalTripPrice();

        String location, destination, ride;
        int choiceLoc, choiceDest, choiceRide;
        int tripConfirmation;
        int rideTypeConfirmation2;

        boolean again = true;
        do {
            System.out.println("Enter 1 for request ride, 2 for making complain, 0 for get back");
            int choice = scanner.nextInt();
            if(choice == 1) {
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
                    if (rideTypeConfirmation2 == 1) {
                        float totalPricee = totalP.totalPrice(location, destination, ride);
                        System.out.println("total price for the trip is: " + totalPricee);
                        DisplayPayment dp = new DisplayPayment(totalPricee);
                        ReviewAndRating rr = new ReviewAndRating();
                    }
                    else {
                        System.out.println("\t \t -process canceled-");
                        new DisplayTrip();
                    }
                } else {
                    System.out.println("\t \t -process canceled-");
                    new DisplayTrip();
                }
            }
            else if (choice == 2) {
                Supporting complain = new Supporting();
            }
            else if( choice== 0) {
                again = false;
                System.out.println("\t\t-logging out-");
            }
        } while(again);
    }
}