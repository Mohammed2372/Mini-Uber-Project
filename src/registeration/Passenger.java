package registeration;
import java.util.Scanner;

public class Passenger extends User{

    public Passenger(){}
    public Passenger(String name, String email, String phoneNumber, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
}