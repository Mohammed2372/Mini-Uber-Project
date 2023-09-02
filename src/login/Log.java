package login;
import java.util.Scanner;

public class Log {
    private DriverL driverL;
    private PassengerL passengerL;
    public void log(int rl){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your phone number: ");
        String phoneNumber = scanner.next();
        System.out.println("Enter your password: ");
        String password = scanner.next();
        if(rl == 1){
            passengerL.passengerAuthenticate(phoneNumber,password);
        } else if (rl == 2) {

            driverL.DriverAuthenticate(phoneNumber,password);

        }
    }
}
