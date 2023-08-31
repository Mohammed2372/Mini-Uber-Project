//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ridesTypes {
    Map<String, Float> ridesAndPriceMap = new LinkedHashMap();
    ArrayList<String> ridesList;
    ArrayList<Float> priceList;

    public ridesTypes() {
        FileManager.readRides(this.ridesAndPriceMap);
        this.ridesList = new ArrayList(this.ridesAndPriceMap.keySet());
        this.priceList = new ArrayList(this.ridesAndPriceMap.values());
    }

    public void display(int choice) {
        int i;
        Iterator var3;
        if (choice == 1) {
            i = 1;

            for(var3 = this.ridesList.iterator(); var3.hasNext(); ++i) {
                String key = (String)var3.next();
                System.out.print("" + i + "." + key + "\t");
            }

            System.out.println();
        } else if (choice == 2) {
            i = 1;

            for(var3 = this.ridesAndPriceMap.entrySet().iterator(); var3.hasNext(); ++i) {
                Map.Entry<String, Float> entry = (Map.Entry)var3.next();
                String key = (String)entry.getKey();
                float value = (Float)entry.getValue();
                System.out.printf("" + i + "." + key + ": " + value + "\t");
            }

            System.out.println();
        }

    }

    public float getPrice(String ride) {
        return (Float)this.ridesAndPriceMap.get(ride);
    }

    public float calculateRide(float ridePrice, String rideType) {
        return ridePrice * this.getPrice(rideType);
    }
}
