package registeration;

import java.util.Scanner;

public class Registeration {
    static Scanner scanner = new Scanner(System.in);
    public static void passengerRegisteration(User user){
        System.out.println("Enter your name:");
        user.name = scanner.next();
        System.out.println("Enter your email:");
        user.email = scanner.next();
        System.out.println("Enter your password:");
        user.password = scanner.next();
        Validation.confirmingPassword(user.password);
        System.out.println("Enter your phone number:");
        user.phoneNumber = scanner.next();
    }
    public static void driverRegistraion(Driver driver){
        passengerRegisteration(driver);
        System.out.println("Enter your car color:");
        driver.carColor= scanner.next();
        System.out.println("Enter your car number:");
        driver.carNumber= scanner.next();

    }
}
