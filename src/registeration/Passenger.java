package registeration;
import java.util.Scanner;

public class Passenger extends User{

    private Passenger(){}
    private static volatile Passenger passenger = null;
    public static Passenger getInstance(){
        Passenger result = passenger;
        if(result == null){
            synchronized(Passenger.class){
                result = passenger;
                if(result == null){
                    result = passenger = new Passenger();
                }
            }
        }
        return result;
    }

    public Passenger(String name, String email, String password, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
    @Override
    void registeration(User passenger){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = scanner.next();
        System.out.println("Enter your email:");
        email = scanner.next();
        System.out.println("Enter your password:");
        password = scanner.next();
        System.out.println("Enter your phone number:");
        phoneNumber = scanner.next();
        Validation.assignUser(FileReader.getdataInstance().getPassengers(), passenger, Validation.checkphone(FileReader.getdataInstance().getPassengers(), passenger.phoneNumber));

    }
}