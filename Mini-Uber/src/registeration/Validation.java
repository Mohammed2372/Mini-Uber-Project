package registeration;
import java.util.Vector;

class Validation{
        static boolean checkphone(Vector<User> vector, String phoneNumber){
            boolean check = true;
            for(int i = 0; i<vector.capacity(); i++){
                if(phoneNumber.equals( vector.get(i).phoneNumber)){
                    System.out.println("This phone number is already exist!");
                    check = false;
                }
            }
            return check;
        };

        void assignUser(Vector<User> vector,User user, boolean check){
            if (check == true){
                vector.addElement(user);
            }
        };
    }


