package login;

import registeration.Driver;
import registeration.ReadFile;
import registeration.User;

import java.util.Vector;

public class DriverL extends Login{
    public DriverL(){
    }
    public DriverL(String username, String password) {
        super(username, password);
    }
    public boolean DriverAuthenticate(String userPhonenumber, String userPassword) {
        Vector<User> drivers = ReadFile.getdataInstance().getDrivers();
        boolean exist = false;
        for (User driver : drivers) {
            if (userPhonenumber.equals(driver.getPhoneNumber()) && userPassword.equals(driver.getPassword())) {
                System.out.println("Login Accepted\n");
                exist = true;
                break;
            }
        }
        if (!exist)
        {
            System.out.println("Login Refuesd\n");
        }
        return exist;
    }
}
