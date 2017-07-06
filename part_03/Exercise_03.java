package part_03;


import java.util.Random;
import java.util.Scanner;

/**

 Implement the following methods

 */

class Exercise_03 {


    public static void main(String[] strings) {
        for (int i = 0; i < 6; i++) {
            Random rm = new Random();
            int answer = rm.nextInt(12) + 1;
            String monthName = getMonthName(answer);
            System.out.println(monthName);
            System.out.println(answer);


            // use a for loop to iterate 1000 times {
            // Generate a random int between >= 1 and <= 12
            // call getMonthName(int month) and pass your random int
            // print the name of the month and the random int generated to the console
        }

    }

    // Get the name for the month using the random int you generated
    public static String getMonthName(int month) {

        // use a switch statement to determine the name of the month
        switch (month) {
            case 1:
                return ("January");
            case 2:
                return ("Feb");
            case 3:
                return ("March");
            case 4:
                return ("April");
            case 5:
                return ("May");
            case 6:
                return ("June");
            case 7:
                return ("July");
            case 8:
                return ("August");
            case 9:
                return ("Sept");
            case 10:
                return ("October");
            case 11:
                return ("November");
            case 12:
                return ("December");
            default:
                return ("could not find month");
            // for instance if the random int is 1 the name of month is January

            // return the month name

        }
    }
}