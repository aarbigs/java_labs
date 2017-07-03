package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "nested-if" statement;
 *
 *
 */
public class Exercise_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (num<=10){
            if(num==1){
                System.out.println("ONE");
            } else if(num==2){
                System.out.println("TWO");
            } else if(num==3){
                System.out.println("NINE");
            }
        } else{
            System.out.println("OTHER");
        }
        }

    }

