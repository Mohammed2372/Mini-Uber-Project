package srt;

import java.util.Scanner;

public class ReviewAndRating {
    Scanner input = new Scanner(System.in);

    public ReviewAndRating()
    {
        System.out.println("\t\t\t Welcome");
        System.out.println("About App:\nit's a transportation conglomerate that mainly provides safe taxi services where individuals can hail a taxi using their phone.");
        System.out.println("Your Rating and feedback help us improve the experience.");
        System.out.println("Please Enter your review.");
        String review = input.nextLine(); //taking review
        System.out.println("Thanks for review.");
        System.out.println("Please Enter your Rating from 1 to 5.");
        int rating = input.nextInt(); //taking rating
        System.out.println("Thanks for rating.");        // saving the review and rating in the file with the passenger name
        //System.out.println("have a nice trip.");
    }
}
