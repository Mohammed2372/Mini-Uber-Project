package PaymentType;

class Visa extends Payment {

    @Override
    void pay(int amount) {
        // Save the payment information to a file.
        // FileWriter to save the data That's Example : modify it to the calsses you named " Files Admin " !!!?

        try (fileWriter writer = new fileWriter(new File("visa_payments.txt"))) {
            writer.write("Payment of $" + amount + " made using PaymentType.Visa.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
