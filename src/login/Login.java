package login;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Login {
    String phoneNumber;
    String password;
    public Login(String username, String password) {
        this.phoneNumber = username;
        this.password = password;
    }
}