package login;

import java.util.Scanner;
import java.util.Vector;

public class
PassengerL extends Login {

    public PassengerL(String username, String password) {
        super(username, password);
    }

    public boolean passengerAuthenticate(String userPhonenumber, String userPassword) {
        Vector<Login> passengers = FileReaderL.getdataInstance().getPassengers();
        boolean exist = false;
        for (Login passenger : passengers) {
            if (userPhonenumber.equals(passenger.phoneNumber) && userPassword.equals(passenger.password)) {
                exist = true;
                System.out.println("This phone number is already exist!");
            }
        }
        return exist;
    }
}
