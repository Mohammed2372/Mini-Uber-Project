package registeration;
import java.util.Scanner;

public class Driver extends User {
    public java.lang.System System;
    String carColor;
    String carNumber;
    private Driver(){}

    private static volatile Driver driver = null;

    public static Driver getInstance() {
        Driver result = driver;
        if (result == null){
            synchronized (Driver.class){
                result = driver;
                if(result == null){
                    result = driver = new Driver();
                }
            }
        }
        return result;
    }
    public Driver(String name, String email, String password, String phoneNumber, String carNumber, String carColor) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.carColor = carColor;
        this.carNumber = carNumber;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void registeration(User driver) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = scanner.next();
        System.out.println("Enter your email:");
        email = scanner.next();
        System.out.println("Enter your password:");
        password = scanner.next();
        Validation.confirmingPassword(password);
        System.out.println("Enter your phone number:");
        phoneNumber = scanner.next();
        System.out.println("Enter your car number");
        carNumber = scanner.next();
        System.out.println("Enter you car's color");
        carColor = scanner.next();

        Validation.checkphone(FileReader.getdataInstance().getDrivers(), phoneNumber);
    }

}