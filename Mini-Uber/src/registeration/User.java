package registeration;

import java.util.Scanner;

public abstract class User {
    String name;
    String email;
    String password;
   String phoneNumber;
   abstract void registeration(User user);
}
