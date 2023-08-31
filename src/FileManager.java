import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Vector;

import registeration.*;


public class FileManager {
    public static void writeLocations() {
        Map<String, Integer> locationAndPriceMap = new LinkedHashMap<>();

        locationAndPriceMap.put("Shobra Elkhiema", 2000);
        locationAndPriceMap.put("Aabass", 3000);
        locationAndPriceMap.put("Ain Shams", 2500);
        locationAndPriceMap.put("Elmarg", 3000);
        locationAndPriceMap.put("Nasr City", 3000);
        locationAndPriceMap.put("Elshiekh zayed", 3000);
        locationAndPriceMap.put("Elmokatam", 3000);
        locationAndPriceMap.put("Elmaady", 3000);
        locationAndPriceMap.put("Elaataba", 3000);
        locationAndPriceMap.put("Elzamalek", 3000);
        locationAndPriceMap.put("Down Town", 3000);
        locationAndPriceMap.put("Elmohandseen", 3000);
        locationAndPriceMap.put("Elaabasya", 3000);
        locationAndPriceMap.put("Masr Elgededa", 3000);
        locationAndPriceMap.put("Hadaek Elzayton", 3000);
        locationAndPriceMap.put("Ramses", 3000);
        locationAndPriceMap.put("Ezbet Elnakhl", 3000);
        locationAndPriceMap.put("Elameria", 3000);
        locationAndPriceMap.put("Elhaykesteb", 3000);
        locationAndPriceMap.put("6 october", 3000);
        locationAndPriceMap.put("Elmehwar", 3000);
        locationAndPriceMap.put("Helwan", 3000);
        locationAndPriceMap.put("Hadaek Elahram", 3000);
        locationAndPriceMap.put("First tagamoa", 3000);
        locationAndPriceMap.put("Fifth tagamoa", 3000);
        locationAndPriceMap.put("Elabour", 3000);
        locationAndPriceMap.put("10's Of Ramadan", 3000);
        locationAndPriceMap.put("Elsaida Aa'sha", 3000);
        locationAndPriceMap.put("Elharam", 3000);
        locationAndPriceMap.put("", 3000);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Locations.txt"));
            for (Map.Entry<String, Integer> entry : locationAndPriceMap.entrySet()) {
                writer.write(entry.getKey() + " - " + entry.getValue() + "\n");
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static Map<String, Integer> readLocations() {
        Map<String, Integer> resultMap = new LinkedHashMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Locations.txt"));
            String Line;
            while ((Line = reader.readLine()) != null) {
                String[] parts = Line.split(" - ");
                if (parts.length == 2) {
                    String key = parts[0].trim();
                    int value = Integer.parseInt(parts[1].trim());

                    resultMap.put(key, value);
                }
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }

        return resultMap;
    }

    public static void writeRides() {
        Map<String, Float> ridesAndPriceMap = new LinkedHashMap<>();

        ridesAndPriceMap.put("VIP Car", 2f);
        ridesAndPriceMap.put("normal Car", 1f);
        ridesAndPriceMap.put("Bus", .8f);
        ridesAndPriceMap.put("Motorcycle", .5f);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Rides.txt"));
            for (Map.Entry<String, Float> entry : ridesAndPriceMap.entrySet()) {
                writer.write(entry.getKey() + " - " + entry.getValue() + "\n");
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static Map<String, Float> readRides() {
        Map<String, Float> resultMap = new LinkedHashMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Rides.txt"));
            String Line;
            while ((Line = reader.readLine()) != null) {
                String[] parts = Line.split(" - ");
                if (parts.length == 2) {
                    String key = parts[0].trim();
                    Float value = Float.parseFloat(parts[1].trim());

                    resultMap.put(key, value);
                }
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }

        return resultMap;
    }

    public static void writeDrivers() {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Drivers.txt"));
            for (var driver : fileReader.getdataInstance().getDrivers()) {
                driver = (Driver) driver;
                System.out.println(driver.getName() + " - " + driver.getEmail() + " - " + driver.getPhoneNumber() + " - " + driver.getPassword() + " - " + ((Driver) driver).getCarNumber() + " - " + ((Driver) driver).getCarColor() + "\n");
                writer.write(driver.getName() + " - " + driver.getEmail() + " - " + driver.getPhoneNumber() + " - " + driver.getPassword() + " - " + ((Driver) driver).getCarNumber() + " - " + ((Driver) driver).getCarColor() + "\n");
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static void writePassengers() {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Passengers.txt"));
            for (var p : fileReader.getdataInstance().getPassengers()) {
                p = (Passenger) p;
                System.out.println(p.getName() + " - " + p.getEmail() + " - " + p.getPhoneNumber() + " - " + p.getPassword() + "\n");
                writer.write(p.getName() + " - " + p.getEmail() + " - " + p.getPhoneNumber() + " - " + p.getPassword() + "\n");
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
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
