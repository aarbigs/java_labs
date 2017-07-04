package part_02;


import java.util.Scanner;

/**
 * Part 2 Exercise 10:
 *
 *      Write a program that prints out every prime number between 1 and 100
 *
 */
public class Exercise_10 {

    public static void main(String[] args) {
        int count;
        for (int i=2;i<=100;i++){
            count = 0;
            for (int j=1;j<=i;j++){
                if ((i%j)==0){
                    count++;
                    if (count > 2){
                        break;
                    }
                }
            }
            if (count==2) {
                System.out.println(i);
            }
        }
    }
}
