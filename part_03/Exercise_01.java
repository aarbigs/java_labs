package part_03;

import java.util.Scanner;

/**
  Write 3 classes. These classes can reside in the same file for ease and clarity.
  The first class (the controller) should have at least two methods, one of which being a main method.
  The main method needs to utilize constructors to create at least two separate objects. Each class must
  have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
  objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
  Vehicle object in this exercise :)

  Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
  sports teams, trees, beers, people and so on.

 **/
class Controller {
    public static void main(String[] Strings) {

        System.out.print("Enter a number of seconds to exercise: ");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        System.out.println("Enter your favorite type of exercise: ");
        String exercise = input.next();
        System.out.println("Ready to start? Press Y/N:");
        String response = input.next();

        if (response.equalsIgnoreCase("Y")){
            Exercise e = new Exercise();
            e.exercise(num,exercise);
            System.out.println("you rock");
            System.out.printf("would you like to have some beer: Y/N?");
            String drinkBeer = input.next();

            if (drinkBeer.equalsIgnoreCase("Y")){
                System.out.println("how mnay beers would you like: ");
                int numBeers = input.nextInt();

                for (int i = 0; i < numBeers; i++){
                    System.out.println("What type of beer would you like?");
                    String type = input.next();
                    System.out.println("What brand of beer would you like? ");
                    String brand = input.next();
                    Beers beer = new Beers(type,brand);
                    System.out.println("you are currently enjoying " + beer.brand + " "+ beer.type +"...");

                    try {
                        Thread.sleep(3000);
                        System.out.println("Yum tasty");
                    } catch (InterruptedException b) {
                        b.printStackTrace();
                    }
                }
            } else {
                System.out.println("Would you like to study instead? Y/N");
                String studyResponse = input.next();

                if (studyResponse.equalsIgnoreCase("Y")){
                    System.out.println("How long should we study for in hours: ");
                    int howLongStudy = input.nextInt();

                    if (howLongStudy >= 6){
                        System.out.println("That's crazy I'm going to have a beer instead");

                    } else {
                        System.out.println("What should we study?");
                        String study = input.next();
                        Study studying = new Study(study,howLongStudy);
                        System.out.println("Good job we are studying "+studying.study+"for"+studying.howLongStudy+"hours");

                    }
                }

            }
        } else {
            System.out.println("you lazy");
            System.out.println("no beers for you!");
        }
    }

}

class Beers {

    String type;
    String brand;

    Beers(String type, String brand){
        this.type = type;
        this.brand = brand;
    }

}


class Study {
    String study;
    int howLongStudy;

    Study(String study, int howLongStudy){
        this.study = study;
        this.howLongStudy = howLongStudy;
    }
}

class Exercise {

    public void exercise(int duration, String exerciseType){
        System.out.println("Currently " + exerciseType + ".........");
        try {
            Thread.sleep(duration * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("all done great work");

    }
}


