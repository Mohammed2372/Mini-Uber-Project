package registeration;
import java.util.Scanner;
import java.util.Vector;

public class Validation{
    public boolean checkphone(Vector<User> vector, String phoneNumber){
        boolean check = true;
        for(int i = 0; i< vector.size(); i++){
            if(phoneNumber.equals( vector.get(i).phoneNumber)){
                System.out.println("This phone number is already exist!");
                check = false;
            }
        }
        return check;
    };
    public static void confirmingPassword(String password) {
        Scanner scanner = new Scanner(System.in);
        String confirmPassword;
        do {
            System.out.println("Confirm Password:");
            confirmPassword = scanner.next();
        } while (!confirmPassword.equals(password));

    }
    public static void assignUser(Vector<User> vector, User user) {
        vector.addElement(user);
        System.out.println("user added");
    }
}


