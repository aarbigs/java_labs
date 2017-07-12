package part_04;

import java.util.Scanner;

/**

 Read in 10 integers from the user. Place all 10 integers into an array in the order they were received.
 Print out the second integer received, followed by the 4th, then the 6th, then the 8th, then the 10th.
 The print out the 9th, 7th, 5th, 3rd, and 1st.

 Example input: 1,2,3,4,5,6,7,8,9,10
 Example output: 2,4,6,8,10,9,7,5,3,1

 Output can be on one line or many lines. However you like.

 */

class TenIntegers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrayOfTen = new int[10];
        System.out.println("Enter a number: ");
        for (int i = 0; i < arrayOfTen.length; i++) {
            arrayOfTen[i] = input.nextInt();

        }
        for (int j = 1; j < arrayOfTen.length; j+=2){
            System.out.println(arrayOfTen[j]);
        }
        for (int z = arrayOfTen.length-2; z>=0; z-=2){
            System.out.println(arrayOfTen[z]);
        }

    }
}