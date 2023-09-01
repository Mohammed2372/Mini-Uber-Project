package Files;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class LocationManager {
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

}
