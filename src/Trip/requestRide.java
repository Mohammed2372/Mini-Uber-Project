package Trip;

import Files.FileManager;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class requestRide {
    public Map<String, Integer> locationAndPriceMap = new LinkedHashMap();
    public ArrayList<String> locationList;

    public requestRide() {
        //initializing locations map (constant)
        locationAndPriceMap = FileManager.readLocations();
        // initializing list with map keys
        locationList = new ArrayList<>(locationAndPriceMap.keySet());
    }

    public void display(int choice) {

        if (choice == 1) {   //display the list of locations
            int i = 1;
            for (String key : locationList) {
                System.out.print(i + "." + key + "    ");
                if (i % 10 == 0) {
                    System.out.println();
                }
                i++;
            }
            System.out.println();
        } else if (choice == 2) {   // display map
            int i = 1;
            for (Map.Entry<String, Integer> entry : locationAndPriceMap.entrySet()) {
                String key = entry.getKey();
                int value = entry.getValue();
                System.out.println(i + "." + key + ": " + value + "\t");
                i++;
            }
            System.out.println();
        }
    }

    public float getPrice(String location) {
        return (float)(Integer)this.locationAndPriceMap.get(location);
    }

    public float calculateRide(String location, String destination) {
        return Math.abs(this.getPrice(location) - this.getPrice(destination));
    }
}
