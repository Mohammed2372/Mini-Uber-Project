package PaymentType;
import Files.*;
import java.io.FileWriter;

class Cash extends Payment {

    @Override
    void pay(int amount) {
        // Save the payment information to a file.
        try (FileWriter writer = new FileWriter(new FileWriter("cash_payments.txt"))) {
            writer.write("Payment of $" + amount + " made using cash.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}