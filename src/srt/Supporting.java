package srt;

import java.util.Scanner;

public class Supporting {
    public Supporting(){};
    Scanner input = new Scanner(System.in);
    void support()
    {
        System.out.println("\t\t\tWelcome.");
        System.out.println("If You have a Report about some Driver, Please Enter 1.\nIf about Account Settings, Please Enter 2.\nIf Other Complaints, Please Enter 3.");
        int type = input.nextInt();
        if(type == 1) //storing driver complaints
        {
            System.out.print("Please Enter Driver ID: ");
            String ID = input.next();
            System.out.println("Please Enter your Complaint.");
            String complaint1 = input.nextLine();       //save the complaint the the passenger phone number and driver id in the file
        }
        /*if(type==2)
        {
            AccountSettings();
        }*/
        else //storing other complaints
        {
            System.out.println("Enter your Complaint.");
            String complaint2 = input.nextLine();       //save the complaint in the file
            System.out.println("We've received your Complaint and we'll help you as soon as possible.");
        }

    }
}
