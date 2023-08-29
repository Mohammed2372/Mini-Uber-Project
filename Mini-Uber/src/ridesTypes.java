import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class ridesTypes {

    Map<String, Float> ridesAndPriceMap = new LinkedHashMap<>();
    ArrayList<String> ridesList;
    ArrayList<Float> priceList;

    public ridesTypes(){
        //initializing rides map (constant)
       FileManager.readRides(ridesAndPriceMap);

        // initializing list with map keys and values
        ridesList = new ArrayList<>(ridesAndPriceMap.keySet());
        priceList = new ArrayList<>(ridesAndPriceMap.values());

    }
    public void display(int choice){
        if(choice == 1) {   //display the list of locations
            int i = 1;
            for (String key : ridesList) {
                System.out.print(i+"."+key+"\t");
                i++;
            }
            System.out.println();
        } else if (choice == 2) {   // display map
            int i = 1;
            for (Map.Entry<String, Float> entry : ridesAndPriceMap.entrySet()) {
                String key = entry.getKey();
                float value = entry.getValue();
                System.out.printf(i+"."+key + ": " + value + "\t");
                i++;
            }
            System.out.println();
        }
    }
    public float getPrice(String ride) {
        return ridesAndPriceMap.get(ride);
    }

    public float calculateRide(float ridePrice,String rideType){
        return  ridePrice * getPrice(rideType);
    }

}
