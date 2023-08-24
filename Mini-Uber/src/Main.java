import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        requestRide map = new requestRide();
        ridesTypes rides = new ridesTypes();
        totalTripPrice tp = new totalTripPrice();

        Scanner scanner= new Scanner(System.in);
        String location,destination,ride;
        int choiceLoc,choiceDest,choiceRide;
        int confirmation = 1;

        //price for distance
        map.display(1);
        System.out.println("choose the location and the destination by the name or number.");
        // choosing location
        System.out.print("Location: ");
        if (scanner.hasNextInt()){  // to make the user able to choose with numbers
            choiceLoc = scanner.nextInt();
            location = map.locationList.get(choiceLoc-1);
        }
        else {
            location = scanner.next();
        }
        // choosing destination
        map.display(1);
        System.out.print("Destination: ");
        if (scanner.hasNextInt()){  // to make the user able to choose with numbers
            choiceDest = scanner.nextInt();
            destination = map.locationList.get(choiceDest-1);
        }
        else {
            destination = scanner.next();
        }
        System.out.println("the price will be: " + map.calculateRide(location,destination));
        System.out.println("type 1 to confirm, 0 cancel" );
        confirmation = scanner.nextInt();
        if(confirmation == 0) {
            System.out.println("\t \t -process canceled-");
            main(args);
        }
        //price for the ride
        rides.display(1);
        System.out.println("choose type of ride you want by word or number");
        if (scanner.hasNextInt()){  // to make the user able to choose with numbers
            choiceRide = scanner.nextInt();
            ride = rides.ridesList.get(choiceRide-1);
        }
        else {
            ride = scanner.next();
        }
        System.out.println("the total price will be: " + tp.totalPrice(location,destination,ride));
        System.out.println("type 1 to confirm, 0 to cancel" );
        confirmation = scanner.nextInt();
        if(confirmation == 0) {
            System.out.println("\t \t -process canceled-");
            main(args);
        }



        scanner.close();
    }
}