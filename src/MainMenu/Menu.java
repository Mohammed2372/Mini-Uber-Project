package MainMenu;
import login.*;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Log log;
    public Menu() {
        boolean again = false;
        do {
            System.out.println("Enter 1 for Passenger, 2 for Driver, 3 for Admin");
            int pda = scanner.nextInt();
            if (pda == 1) { // passenger
                boolean againn = false;
                do {
                    int rl = scanner.nextInt();
                    System.out.println("Enter 1 for Register, 2 for Login");
                    if (rl == 1) { // register

                    } else if (rl == 2) { // login
                       log.log(rl);
                    } else {
                        againn = true;
                        System.out.println("please enter valid number (1 or 2)");
                    }
                } while (againn);
            } else if (pda == 2) { // driver
                boolean againn = false;
                do {
                    int rl = scanner.nextInt();
                    System.out.println("Enter 1 for Register, 2 for Login");
                    if (rl == 1) { // register

                    } else if (rl == 2) { // login
                        log.log(rl);
                    } else {
                        againn = true;
                        System.out.println("please enter valid number (1 or 2)");
                    }
                } while (againn);
            } else if (pda == 3) { // admin

            } else {
                again = true;
                System.out.println("invaild number, please enter the number again");
            }
        } while (again);

    }
}
