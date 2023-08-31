//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class requestRide {
    Map<String, Integer> locationAndPriceMap = new LinkedHashMap();
    ArrayList<String> locationList;

    public requestRide() {
        FileManager.readLocations(this.locationAndPriceMap);
        this.locationList = new ArrayList(this.locationAndPriceMap.keySet());
    }

    public void display(int choice) {
        int i;
        Iterator var3;
        if (choice == 1) {
            i = 1;

            for(var3 = this.locationList.iterator(); var3.hasNext(); ++i) {
                String key = (String)var3.next();
                System.out.print("" + i + "." + key + "    ");
                if (i % 10 == 0) {
                    System.out.println();
                }
            }

            System.out.println();
        } else if (choice == 2) {
            i = 1;

            for(var3 = this.locationAndPriceMap.entrySet().iterator(); var3.hasNext(); ++i) {
                Map.Entry<String, Integer> entry = (Map.Entry)var3.next();
                String key = (String)entry.getKey();
                int value = (Integer)entry.getValue();
                System.out.println("" + i + "." + key + ": " + value + "\t");
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
