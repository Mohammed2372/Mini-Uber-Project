package registeration;
import java.util.Scanner;
import java.util.Vector;

class Validation{
    static boolean checkphone(Vector<User> vector, String phoneNumber){
        boolean check = true;
        for(int i = 0; i< vector.size(); i++){
            if(phoneNumber.equals( vector.get(i).phoneNumber)){
                System.out.println("This phone number is already exist!");
                check = false;
            }
        }
        return check;
    };
    static void confirmingPassword(String password){
//            boolean checkToContinue = true;
        Scanner scanner = new Scanner(System.in);
        String confirmPassword;
        do {
            System.out.println("Confirm Password:");
            confirmPassword = scanner.next();
//                if(!confirmPassword.equals(password)){
//                    System.out.println("Do you want to try again?");
//                    String choose = scanner.next();
//                    if(!choose.toLowerCase().equals("yes")){
//                        checkToContinue = false;
//                    }
//                }
        } while (!confirmPassword.equals(password));
//            return checkToContinue;
    };
    static void assignUser(Vector<User> vector, User user, boolean check){
        if (check){
            vector.addElement(user);
            System.out.println("user added");
        }
    };
}


