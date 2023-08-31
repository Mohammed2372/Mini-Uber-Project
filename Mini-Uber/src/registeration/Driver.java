package registeration;

import java.util.Scanner;

public class Driver extends User {

//    static Driver driver = new Driver();


    public Driver(){};

    public Driver(String name, String email, String password, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.password = password;
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
        System.out.println("Enter your phone number:");
        phoneNumber = scanner.next();
        Validation.assignUser(FileReader.getdataInstance().getDrivers(),driver, Validation.checkphone(FileReader.getdataInstance().getDrivers(), driver.phoneNumber));

    }
}


