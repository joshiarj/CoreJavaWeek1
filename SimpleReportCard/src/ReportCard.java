/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asmit Joshi
 */
import java.util.Scanner;

public class ReportCard {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        //while (true) {
        System.out.println("Enter marks in English:");
        float englishMarks = input.nextFloat();
        System.out.println("Enter marks in Nepali:");
        float nepaliMarks = input.nextFloat();
        System.out.println("Enter marks in Math:");
        float mathMarks = input.nextFloat();
        System.out.println("Enter marks in Science:");
        float scienceMarks = input.nextFloat();
        System.out.println("Enter marks in Computer:");
        float computerMarks = input.nextFloat();

        float totalMarks = englishMarks + nepaliMarks + mathMarks + scienceMarks + computerMarks;
        System.out.println("Grand Total = " + totalMarks);

        //Check if passed in ALL subjects
        if (englishMarks < 32 || nepaliMarks < 32 || mathMarks < 32 || scienceMarks < 32 || computerMarks < 32) {
            System.out.println("You have failed in a subject(s)! Cannot proceed further.");
            System.exit(0);
        }

        float percentageMarks = totalMarks / 5;
        System.out.println("Percentage = " + percentageMarks + "%");

        //Determining grade
        if (percentageMarks >= 32 && percentageMarks < 40) {
            System.out.println("Grade E");
        } else if (percentageMarks >= 40 && percentageMarks < 50) {
            System.out.println("Grade D");
        } else if (percentageMarks >= 50 && percentageMarks < 60) {
            System.out.println("Grade C");
        } else if (percentageMarks >= 60 && percentageMarks < 70) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade A");
        }

        /*//Add more data?
            System.out.println("Do you want to add another student's marks? [Y/N]");
            String confirmation = input.next();
            if (confirmation.equals("N")){// == "N" || confirmation == "n") {
                System.exit(0);
            }*/
        //}
    }
}
