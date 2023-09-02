package Files;

import registeration.Passenger;
import registeration.User;
import registeration.ReadFile;

import java.io.*;
import java.util.Vector;

public class PassengerManager {

    public static void writePassengers() {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Passengers.txt"));
            for (var p : ReadFile.getdataInstance().getPassengers()) {
                p = (Passenger) p;
                writer.write(p.getName() + " - " + p.getEmail() + " - " + p.getPhoneNumber() + " - " + p.getPassword() + "\n");
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }


    public static Vector<User> readPassengers() {
        Vector<User> resultVector = new Vector<User>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Passengers.txt"));
            String Line;
            while ((Line = reader.readLine()) != null) {
                String[] parts = Line.split(" - ");
                if (parts.length == 4) {
                    String name = parts[0].trim();
                    String email = parts[1].trim();
                    String phone = parts[2].trim();
                    String password = parts[3].trim();

                    resultVector.addElement(new Passenger(name, email, phone, password));
                }
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }

        return resultVector;
    }

}
