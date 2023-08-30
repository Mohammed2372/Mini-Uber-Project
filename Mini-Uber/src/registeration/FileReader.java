package registeration;
import java.util.Vector;

public class FileReader{
    Vector<User> passengers ;
    Vector<User> drivers;
    private static FileReader dataInstance = new FileReader();
    private FileReader(){
        passengers = new Vector<User>();
        drivers = new Vector<User>();
        drivers.add(new Driver("amr","alattar@ses","sasf234","0112345"));
        drivers.add(new Driver("amr","alattar@ses","qwer234","12345"));
    }
    public static FileReader getdataInstance(){
        return FileReader.dataInstance;
    }

    public Vector<User> getPassengers() {
        return passengers;
    }

    public Vector<User> getDrivers(){
        return drivers;
    }
}
