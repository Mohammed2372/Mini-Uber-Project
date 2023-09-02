package registeration;

import java.util.Scanner;

public abstract class User {
    String name;
    String email;
    String password;
    String phoneNumber;

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
