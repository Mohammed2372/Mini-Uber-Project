package Files;

import registeration.*;

import java.io.*;
import java.util.Vector;

public class DriverManager {

    public static void writeDrivers() {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Drivers.txt"));
            for (var driver : ReadFile.getdataInstance().getDrivers()) {
                driver = (Driver) driver;
                System.out.println(driver.getName() + " - " + driver.getEmail() + " - " + driver.getPhoneNumber() + " - " + driver.getPassword() + " - " + ((Driver) driver).getCarNumber() + " - " + ((Driver) driver).getCarColor() + "\n");
                writer.write(driver.getName() + " - " + driver.getEmail() + " - " + driver.getPhoneNumber() + " - " + driver.getPassword() + " - " + ((Driver) driver).getCarNumber() + " - " + ((Driver) driver).getCarColor() + "\n");
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static Vector<User> readDrivers() {
        Vector<User> resultVector = new Vector();

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

}
