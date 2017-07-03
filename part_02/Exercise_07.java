package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {


    public static void main(String[] args) {
        System.out.print("Enter a number of minutes up to 1,000,000,000: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        double years = num/60/24/365;
        double days = years%1*365;
        if (num > 525600 && num <= 1000000000){
            System.out.println(years+" years and "+days+" days");
        } else if (num >= 1440 && num <=525600){
            System.out.println(num/60/24);
        } else{
            System.out.println(num);
        }
    }

}
