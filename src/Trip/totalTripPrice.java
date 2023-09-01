package Trip;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class totalTripPrice {
    public totalTripPrice() {
    }

    public float totalPrice(String location, String destination, String rideType) {
        requestRide rr = new requestRide();
        ridesTypes rT = new ridesTypes();
        return rT.calculateRide(rr.calculateRide(location, destination), rideType);
    }
}
