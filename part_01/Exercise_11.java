package Part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */
public class Exercise_11 {

    public static void main(String[] strings) {

        int population = 380123456;
        int days = 365;
        int personBorn = 6;
        int personDied = -12;
        int immigrants = 40;
        int secondsInADay = 60*60*24;
        int personsBorninADay = secondsInADay/personBorn;
        int personsDiedinADay = secondsInADay/personDied;
        int personsImmigrated = secondsInADay/immigrants;
        int netPersonsPerDay  = personsBorninADay+personsImmigrated+personsDiedinADay;
        System.out.println(netPersonsPerDay*days*3+population);

    }
}
