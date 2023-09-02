package login;
import java.util.Scanner;

public class LoginDisplay {
    private DriverL driverL = new DriverL();
    private PassengerL passengerL = new PassengerL();
    public boolean LoginDisplay(int rl){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your phone number: ");
        String phoneNumber = scanner.next();
        System.out.println("Enter your password: ");
        String password = scanner.next();
        if(rl == 1){
            if(passengerL.passengerAuthenticate(phoneNumber,password)) {
                return true;
            }
        } else if (rl == 2) {
            return (driverL.DriverAuthenticate(phoneNumber,password));
        }
        return false;
    }
}
