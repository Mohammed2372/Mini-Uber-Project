package main;
import Files.CashManager;
import Files.DriverManager;
import Files.PassengerManager;
import MainMenu.Menu;
import registeration.Driver;
import registeration.ReadFile;


public class Main {
    public static void main(String[] args) {
        ReadFile.passengers = PassengerManager.readPassengers();
        ReadFile.drivers = DriverManager.readDrivers();

        Menu m1 = new Menu();

        DriverManager.writeDrivers();
        PassengerManager.writePassengers();
    }
}