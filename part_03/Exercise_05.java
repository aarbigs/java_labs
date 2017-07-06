package part_03;


import java.util.Scanner;

/**
 *
 */
public class Exercise_05 {

    public static void main(String[] strings) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 999,999,999");
        int num = input.nextInt();
        // read an integer from the user >=1 and <= 999,999,999
        if (num % 4 == 0 && num % 7 == 0){
            System.out.println("The number is divisible by 4 and 7");
        } else if (num % 4 == 0 || num % 7 == 0){
            //System.out.println("The number is divisible by 4 or 7");
        } else if (num % 4 == 0 ^ num % 7 == 0) {
            System.out.println("The number is divisible by 4 or 7 exclusively");
        } else {
            System.out.println("The number is not divisible by either 4 or 7");
        }

        // use the && operator to see if the user's number is divisible by both 4 and 7


        // use the || operator to see if the user's number is divisible by 4 or 7


        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively


        // print out the results
    }
}
