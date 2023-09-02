package MainMenu;
import login.*;
import registeration.*;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    LoginDisplay log = new LoginDisplay();
    public Menu() {
        boolean again = true;
        do {
            System.out.println("Enter 1 for Passenger, 2 for Driver, 0 for exit");
            int pda = scanner.nextInt();
            if (pda == 1) { // passenger
                boolean againn = false;
                do {
                    System.out.println("Enter 1 for Register, 2 for Login, 0 for roll back");
                    int rl = scanner.nextInt();
                    if (rl == 1) { // register
                        Passenger passenger = new Passenger();
                        Registeration.passengerRegisteration(passenger);

                        Validation v1 = new Validation();
                        if(!v1.checkphone(ReadFile.getdataInstance().getPassengers(),passenger.getPhoneNumber())){
                            againn = true ;
                            System.out.println("Enter valid phone number");
                        }
                        else{
                            Validation.assignUser(ReadFile.getdataInstance().getPassengers(),passenger);
                            againn = false;
                            DisplayTrip dt = new DisplayTrip();
                        }
                    } else if (rl == 2) { // login
                        if(log.LoginDisplay(pda)) {
                            DisplayTrip dt = new DisplayTrip();
                        }
                        else againn = true;
                    } else if (rl == 0) {
                        againn = false;
                    } else {
                        againn = true;
                        System.out.println("please enter valid number (1 or 2)");
                    }
                } while (againn);
            } else if (pda == 2) { // driver
                boolean againn = false;
                do {
                    System.out.println("Enter 1 for Register, 2 for Login, 0 for roll back");
                    int rl = scanner.nextInt();
                    if (rl == 1) { // register
                        Driver driver = new Driver();
                        Registeration.driverRegistraion(driver);
                        Validation v1 = new Validation();
                        if(!v1.checkphone(ReadFile.getdataInstance().getDrivers(), driver.getPhoneNumber())){
                            againn = true;
                            System.out.println("enter valid phone number");
                        }
                        else{
                            Validation.assignUser(ReadFile.getdataInstance().getDrivers(),driver);
                            againn = true;
                            DisplayTrip dt = new DisplayTrip();
                        }
                    } else if (rl == 2) { // login
                        if(log.LoginDisplay(pda)) {
                            DisplayTrip dt = new DisplayTrip();
                        }
                        else againn = true;
                    }
                    else if (rl == 0) {
                        againn = false;
                    }
                    else {
                        againn = true;
                        System.out.println("please enter valid number (1 or 2)");
                    }
                } while (againn);
            }
            //else if (pda == 3) { } // admin

             else if(pda == 0) {
                again = false;
                System.out.println("bye bye ...");
            }
             else{
                again = true;
                System.out.println("invaild number, please enter the number again");
            }
        } while (again);
    }
}