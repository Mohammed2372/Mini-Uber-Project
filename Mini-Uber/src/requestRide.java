import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class requestRide {
    HashMap<String,Integer> locationAndPriceMap = new HashMap<>();
    ArrayList<String> locationList ;
    public requestRide(){
        locationAndPriceMap.put("Shobra Elkhiema",2000);
        locationAndPriceMap.put("Aabass",3000);
        locationAndPriceMap.put("Ain Shams",2500);
        locationAndPriceMap.put("Elmarg",3000);
        locationAndPriceMap.put("Nasr City",3000);
        locationAndPriceMap.put("Elshiekh zayed",3000);
        locationAndPriceMap.put("Elmokatam",3000);
        locationAndPriceMap.put("Elmaady",3000);
        locationAndPriceMap.put("Elaataba",3000);
        locationAndPriceMap.put("Elzamalek",3000);
        locationAndPriceMap.put("Down Town",3000);
        locationAndPriceMap.put("Elmohandseen",3000);
        locationAndPriceMap.put("Elaabasya",3000);
        locationAndPriceMap.put("Masr Elgededa",3000);
        locationAndPriceMap.put("Hadaek Elzayton",3000);
        locationAndPriceMap.put("Ramses",3000);
        locationAndPriceMap.put("Ezbet Elnakhl",3000);
        locationAndPriceMap.put("Elameria",3000);
        locationAndPriceMap.put("Elhaykesteb",3000);
        locationAndPriceMap.put("6 october",3000);
        locationAndPriceMap.put("Elmehwar",3000);
        locationAndPriceMap.put("Helwan",3000);
        locationAndPriceMap.put("Hadaek Elahram",3000);
        locationAndPriceMap.put("First tagamoa",3000);
        locationAndPriceMap.put("Fifth tagamoa",3000);
        locationAndPriceMap.put("Elabour",3000);
        locationAndPriceMap.put("10's Of Ramadan",3000);
        locationAndPriceMap.put("Elsaida Aa'sha",3000);
        locationAndPriceMap.put("Elharam",3000);
        //locationAndPriceMap.put("",3000);

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
