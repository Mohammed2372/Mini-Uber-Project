//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FileManager {
    public FileManager() {
    }

    public static void writeLocations() {
        Map<String, Integer> locationAndPriceMap = new LinkedHashMap();
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
            Iterator var2 = locationAndPriceMap.entrySet().iterator();

            while(var2.hasNext()) {
                Map.Entry<String, Integer> entry = (Map.Entry)var2.next();
                String var10001 = (String)entry.getKey();
                writer.write(var10001 + " - " + String.valueOf(entry.getValue()) + "\n");
            }

            writer.close();
        } catch (IOException var4) {
            System.out.println(var4);
        }

    }

    public static Map<String, Integer> readLocations(Map<String, Integer> locationAndPriceMap) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Locations.txt"));

            String Line;
            while((Line = reader.readLine()) != null) {
                String[] parts = Line.split(" - ");
                if (parts.length == 2) {
                    String key = parts[0].trim();
                    int value = Integer.parseInt(parts[1].trim());
                    locationAndPriceMap.put(key, value);
                }
            }

            reader.close();
        } catch (IOException var6) {
            System.out.println(var6);
        }

        return locationAndPriceMap;
    }

    public static void writeRides() {
        Map<String, Float> ridesAndPriceMap = new LinkedHashMap();
        ridesAndPriceMap.put("VIP Car", 2.0F);
        ridesAndPriceMap.put("normal Car", 1.0F);
        ridesAndPriceMap.put("Bus", 0.8F);
        ridesAndPriceMap.put("Motorcycle", 0.5F);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Rides.txt.txt"));
            Iterator var2 = ridesAndPriceMap.entrySet().iterator();

            while(var2.hasNext()) {
                Map.Entry<String, Float> entry = (Map.Entry)var2.next();
                String var10001 = (String)entry.getKey();
                writer.write(var10001 + " - " + String.valueOf(entry.getValue()) + "\n");
            }

            writer.close();
        } catch (IOException var4) {
            System.out.println(var4);
        }

    }

    public static Map<String, Float> readRides(Map<String, Float> ridesAndPriceMap) {
        Map<String, Float> resultMap = new LinkedHashMap();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Rides.txt.txt"));

            String Line;
            while((Line = reader.readLine()) != null) {
                String[] parts = Line.split(" - ");
                if (parts.length == 2) {
                    String key = parts[0].trim();
                    Float value = Float.parseFloat(parts[1].trim());
                    resultMap.put(key, value);
                }
            }

            reader.close();
        } catch (IOException var7) {
            System.out.println(var7);
        }

        return resultMap;
    }
}
