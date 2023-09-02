package Files;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class RideManager {

//    public static void writeRides() {
//        Map<String, Float> ridesAndPriceMap = new LinkedHashMap<>();
//
//        ridesAndPriceMap.put("VIP Car", 2f);
//        ridesAndPriceMap.put("normal Car", 1f);
//        ridesAndPriceMap.put("Bus", .8f);
//        ridesAndPriceMap.put("Motorcycle", .5f);
//
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter("Rides.txt"));
//            for (Map.Entry<String, Float> entry : ridesAndPriceMap.entrySet()) {
//                writer.write(entry.getKey() + " - " + entry.getValue() + "\n");
//            }
//            writer.close();
//        } catch (IOException ex) {
//            System.out.println(ex);
//        }
//    }

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

}
