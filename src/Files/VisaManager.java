package Files;

import PaymentType.Visa;

import java.io.*;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VisaManager {
    public static void writeVisaPayments() {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("visa_payments.txt"));
            for (float amount : Visa.visaPayments)
                writer.write("Payment of $" + amount + " made using visa.\n");
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    public static Vector<Float> readVisaPayments() {
        Vector<Float> resultVector = new Vector<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("visa_payments.txt"));
            String line;

            Pattern pattern = Pattern.compile("\\$([0-9]+)");

            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);

                while (matcher.find()) {
                    float integer = Integer.parseInt(matcher.group(1));

                    resultVector.addElement(integer);
                }
            }

            reader.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }

        return resultVector;
    }
}
