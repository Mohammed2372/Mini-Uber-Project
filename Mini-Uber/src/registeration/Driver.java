package registeration;

public class Driver extends User {

    public Driver(){
        registeration();
    };

    public Driver(String name, String email, String password, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    @Override
    void registeration() {
         super.registeration();
         Validation.checkphone(FileReader.getdataInstance().getDrivers(), phoneNumber);

    }
}


