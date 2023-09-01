package login;
import java.util.Scanner;
public class Login {
    String phoneNumber;
    String password;
    public Login(String username, String password) {
        this.phoneNumber = username;
        this.password = password;
    }
    public void log(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your phone number:");
        phoneNumber = scanner.next();
        System.out.println("Enter your phone number:");
        password = scanner.next();

    }
}