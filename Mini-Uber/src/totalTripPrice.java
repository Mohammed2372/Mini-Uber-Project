public class totalTripPrice {

    totalTripPrice(){

    }
    public float totalPrice(String location,String destination,String rideType){
        requestRide rr = new requestRide();
        ridesTypes rT = new ridesTypes();
        return rT.calculateRide(rr.calculateRide(location,destination), rideType);
    }

}
