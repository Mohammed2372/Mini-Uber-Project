//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        requestRide requestRide = new requestRide();
        ridesTypes ridesT = new ridesTypes();
        totalTripPrice totalP = new totalTripPrice();
        requestRide.display(1);
        System.out.println("choose the location and the destination by the name or number.");
        System.out.print("Location: ");
        String location;
        if (scanner.hasNextInt()) {
            int choiceLoc = scanner.nextInt();
            location = (String)requestRide.locationList.get(choiceLoc - 1);
        } else {
            location = scanner.next();
        }

        requestRide.display(1);
        System.out.print("Destination: ");
        String destination;
        if (scanner.hasNextInt()) {
            int choiceDest = scanner.nextInt();
            destination = (String)requestRide.locationList.get(choiceDest - 1);
        } else {
            destination = scanner.next();
        }

        PrintStream var10000 = System.out;
        float var10001 = requestRide.calculateRide(location, destination);
        var10000.println("the price will be: " + var10001);
        System.out.println("type 1 to confirm, 0 cancel");
        int tripConfirmation = scanner.nextInt();
        if (tripConfirmation == 1) {
            ridesT.display(1);
            System.out.println("choose type of ride you want by word or number");
            String ride;
            if (scanner.hasNextInt()) {
                int choiceRide = scanner.nextInt();
                ride = (String)ridesT.ridesList.get(choiceRide - 1);
            } else {
                ride = scanner.next();
            }

            var10000 = System.out;
            var10001 = totalP.totalPrice(location, destination, ride);
            var10000.println("the total price will be: " + var10001);
            System.out.println("type 1 to confirm, 0 to cancel");
            int rideTypeConfirmation2 = scanner.nextInt();
            if (rideTypeConfirmation2 == 1) {
                var10000 = System.out;
                var10001 = totalP.totalPrice(location, destination, ride);
                var10000.println("total price for the trip is: " + var10001);
            } else {
                System.out.println("\t \t -process canceled-");
                main(args);
            }
        } else {
            System.out.println("\t \t -process canceled-");
            main(args);
        }

    }
}
