package part_03;

import java.util.Scanner;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task.

 */

class BasicMath {
    public static void main(String[] args) {
        System.out.println("Enter a value: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("Enter a value: ");
        int num2 = input.nextInt();
        System.out.println("Enter a value: ");
        int num3 = input.nextInt();
        int x = multiply(num1,num2);
        double y = divide(x,num3);
        System.out.println(num1+" times "+num2+" equals "+x);
        System.out.println("this result divided by "+ num3 +" equals "+y);

    }

    public static int multiply (int a, int b){
        return a * b;
    }
    public static double divide (int c,int d){
        return c / d;
    }

}