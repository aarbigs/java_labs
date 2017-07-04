package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 *
 *      Calculate investment value
 *
 *      Recieved the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */

public class Exercise_11 {
    public static void main(String[] Strings) {
        int product = method1(2,3);
        System.out.println(product);
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter investment amount: ");
//        double investment = input.nextInt();
//
//        System.out.print("Enter annual interest rate in percentage: ");
//        double percentage = input.nextInt();
//        double monthlyInterest = percentage/12;
//        double intPercent = monthlyInterest/100;
//        System.out.print("Enter number of years: ");
//        double years = input.nextInt();
//        double months = years/12;
//
//        System.out.println(investment*((1+intPercent)*(months)));
    }

    public static int method1(int x, int y){
        return x*y;
    }
}

