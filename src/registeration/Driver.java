package registeration;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver extends User {

    public java.lang.System System;
    String carColor;
    String carNumber;
    ArrayList<String> carTypesList = new ArrayList<>();

    //    static Driver driver = new Driver();
    public Driver() {

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
    void registeration(User driver) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = scanner.next();
        System.out.println("Enter your email:");
        email = scanner.next();
        System.out.println("Enter your password:");
        password = scanner.next();
        System.out.println("Enter your phone number:");
        phoneNumber = scanner.next();
        System.out.println("Enter your car number");
        carNumber = scanner.next();
        System.out.println("Enter you car's color");
        carColor = scanner.next();
        System.out.println("choose your car Type: ");
        displayCarTypes();      /// after driver choose his car type save it in the file, if the he hasn't registered before
        // saving the type with choosing the number and getting the type from the list of car's types
        Validation.checkphone(FileReader.getdataInstance().getDrivers(), phoneNumber);
    }
    void setCarTypes(){
        carTypesList.add("Toyota");
        carTypesList.add("Honda");
        carTypesList.add("Nissan");
        carTypesList.add("Ford");
        carTypesList.add("Chevrolet");
        carTypesList.add("BMW");
        carTypesList.add("Mercedes-Benz");
        carTypesList.add("Audi");
        carTypesList.add("Volkswagen");
        carTypesList.add("Kia");
        carTypesList.add("Hyundai");
        carTypesList.add("Lexus");
        carTypesList.add("Jeep");
        carTypesList.add("Mazda");
        carTypesList.add("Subaru");
        carTypesList.add("Fiat");
        carTypesList.add("Renault");
        carTypesList.add("Mitsubishi");
        carTypesList.add("Porsche");
        carTypesList.add("Jaguar");
    }
    void displayCarTypes(){
        int i = 1;
        for (String key : carTypesList) {
            System.out.print(i+"."+key+"\t");
            i++;
        }
        System.out.println();
    }

}


