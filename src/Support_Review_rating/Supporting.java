package Support_Review_rating;

import java.util.Scanner;

public class Supporting {
    Scanner input = new Scanner(System.in);
    public Supporting()
    {
        System.out.println("\t\t\tWelcome.");
        System.out.println("If You have a Report about some Driver, Please Enter 1.\nIf Other Complaints, Please Enter 2.");
        int type = input.nextInt();
        if(type == 1) //storing driver complaints
        {
            System.out.print("Please Enter Driver Phone Number: ");
            String PhoneNumber = input.next();
            System.out.println("Please Enter your Complaint.");
            String complaint1 = input.next();       //save the complaint the the passenger phone number and driver id in the file
        }
        else //storing other complaints
        {
            System.out.println("Enter your Complaint.");
            String complaint2 = input.nextLine();       //save the complaint in the file
            System.out.println("We've received your Complaint and we'll help you as soon as possible.");
        }
    }
}
