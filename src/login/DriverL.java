package login;

import java.util.Vector;

public class DriverL extends Login{
    DriverL(String username, String password) {
        super(username, password);
    }
    public boolean DriverAuthenticate(String userPhonenumber, String userPassword) {
        Vector<Login> drivers = FileReaderL.getdataInstance().getDrivers();
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
