import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class requestRide {
    Map<String,Integer> locationAndPriceMap = new LinkedHashMap<>();
    ArrayList<String> locationList ;
    public requestRide(){

        FileManager.readLocations(locationAndPriceMap);

        // initializing list with map keys
        locationList = new ArrayList<>(locationAndPriceMap.keySet());
    }
    public void display(int choice) {

        if(choice == 1) {   //display the list of locations
            int i = 1;
            for (String key : locationList) {
                System.out.print(i + "." + key + "    ");
                if(i % 10 == 0){
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
        return locationAndPriceMap.get(location);
    }

    public float calculateRide(String location,String destination){
        return Math.abs(getPrice(location) - getPrice(destination));
    }


//    public void addMap(String location, int price){
//        locationAndPriceMap.put(location,price);
//    }
//    public void removeLocation(String location){
//        locationAndPriceMap.remove(location);
//    }

}
