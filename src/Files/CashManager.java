package Files;

import PaymentType.Cash;

import java.io.*;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CashManager {
    public static void writeCashPayments() {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("cash_payments.txt"));
            for (int amount : Cash.cashPayments)
                writer.write("Payment of $" + amount + " made using cash.\n");
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    public static Vector<Integer> readCashPayments() {
        Vector<Integer> resultVector = new Vector<Integer>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("cash_payments.txt"));
            String line;

            Pattern pattern = Pattern.compile("\\$([0-9]+)");

            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);

                while (matcher.find()) {
                    int integer = Integer.parseInt(matcher.group(1));

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
