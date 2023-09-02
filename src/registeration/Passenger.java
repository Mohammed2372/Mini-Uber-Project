package registeration;
import java.util.Scanner;

public class Passenger extends User{

    public Passenger(){}


    public Passenger(String name, String email, String password, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }


}