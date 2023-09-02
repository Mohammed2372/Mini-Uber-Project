package registeration;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class ReadFile {
    static Vector<User> passengers;
    static Vector<User> drivers;
    private static ReadFile dataInstance = new ReadFile();
    private ReadFile() {
    }

    public static void readFiles() {
        passengers = readPassengers();
        drivers = readDrivers();
    }

    public static ReadFile getdataInstance() {
        return ReadFile.dataInstance;
    }

    public Vector<User> getPassengers() {
        return passengers;
    }

    public Vector<User> getDrivers() {
        return drivers;
    }

    public static Vector<User> readDrivers() {
        Vector<User> resultVector = new Vector<User>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Drivers.txt"));
            String Line;
            while ((Line = reader.readLine()) != null) {
                String[] parts = Line.split(" - ");
                if (parts.length == 6) {
                    String name = parts[0].trim();
                    String email = parts[1].trim();
                    String phone = parts[2].trim();
                    String password = parts[3].trim();
                    String carNumber = parts[4].trim();
                    String carColor = parts[5].trim();
                    resultVector.addElement(new Driver(name, email, phone, password, carNumber, carColor));
                }
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return resultVector;
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