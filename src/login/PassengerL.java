package login;

import registeration.Passenger;
import registeration.ReadFile;
import registeration.User;

import java.util.Scanner;
import java.util.Vector;

public class
PassengerL extends Login {

    public PassengerL(){}
    public PassengerL(String username, String password) {
        super(username, password);
    }

    public boolean passengerAuthenticate(String userPhoneNumber, String userPassword) {
        Vector<User> passengers = ReadFile.getdataInstance().getPassengers();
        boolean exist = false;
        System.out.println("passenger size: " + passengers.size());
        for (User passenger : passengers) {
            System.out.println("phone: " + passenger.getPhoneNumber() + "   pass: " + passenger.getPassword());
            if (userPhoneNumber.equals(passenger.getPhoneNumber()) && userPassword.equals(passenger.getPassword())) {
                System.out.println("Login Accepted\n");
//                exist = true;
//                break;
                return true;
            }
        }
        if (!exist)
        {
            System.out.println("Login Refuesd\n");
        }
        return exist;
    }
}
