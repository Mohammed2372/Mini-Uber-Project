package registeration;

public class Passenger extends User{
    public Passenger(){
        registeration();
    };

    public Passenger(String name, String email, String password, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    @Override
    void registeration() {
        super.registeration();
        Validation.checkphone(FileReader.getdataInstance().getPassengers(), phoneNumber);

    }
}
