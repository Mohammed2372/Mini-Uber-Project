package registeration;

import java.util.Scanner;

public abstract class User {
    String name;
    String email;
    String password;
   String phoneNumber;
   void  registeration(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter your name:");
       this.name = scanner.next();
       System.out.println("Enter your email:");
       this.email = scanner.next();
       System.out.println("Enter your password:");
       this.password = scanner.next();
       System.out.println("Enter your phone number:");
       this.phoneNumber = scanner.next();
    }
}
