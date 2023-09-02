package registeration;
import java.util.Scanner;

public class Driver extends User {
    public java.lang.System System;
    String carColor;
    String carNumber;
    public Driver(){}
    public Driver(String name, String email, String password, String phoneNumber, String carNumber, String carColor) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.carColor = carColor;
        this.carNumber = carNumber;
        this.phoneNumber = phoneNumber;
    }
    public String getCarColor() {
        return carColor;
    }
    public String getCarNumber() {
        return carNumber;
    }

}