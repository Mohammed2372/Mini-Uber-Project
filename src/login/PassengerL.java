package login;

import java.util.Vector;

public class PassengerL extends Login {

    public PassengerL(String username, String password) {
        super(username, password);
    }

    public boolean passengerAuthenticate(String userPhonenumber, String userPassword) {
        Vector<Login> drivers = FileReaderL.getdataInstance().getPassengers();
        boolean exist = false;
        for (Login driver : drivers) {
            if (userPhonenumber.equals(driver.phoneNumber) && userPassword.equals(driver.password)) {
                exist = true;
                System.out.println("This phone number is already exist!");
            }
        }
        return exist;
    }
}
