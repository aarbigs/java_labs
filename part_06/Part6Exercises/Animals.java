package part_06.Part6Exercises;

/**
 * Created by aaron on 7/11/17.
 */

//Demonstrate inheritance using 1 super class and 2 subclasses. Each class must be in it's own file.

////Building on the previous examples. Add constructors to each class. Also, if you haven't already, build out
//the inheritance hierarchy at least three tiers. For instance, Class_03 extends Class_02 and Class_02 extends
//Class_01. Use private instance variables in each class. Use constructors in each class. Be sure that Class_03
//can set and modify variables in Class_01.

//Further extrapolating on the previous exercises, add at least two methods to a superclass that are not
//getter/setter methods. Demonstrate the use of these methods from a subclass.

//Demonstrate dynamic method dispatch. Refer to java_book_source Example19, but do not copy it verbatim.
class Animals{

    private boolean isAlive;
    private int weight;
    private int height;

    public Animals(){

    }

    public Animals(boolean isAlive, int weight, int height) {
        this.isAlive = isAlive;
        this.weight = weight;
        this.height = height;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double weightInKilos(){
        return weight / 2.2;
    }
    void AAAAAA() {
        System.out.println("AAAAA in animals");
    }
}

class Mammals extends Animals {
    private boolean inOcean;
    private int age;

    Mammals(){
        super.setAlive(true);
    }
    public boolean isInOcean() {
        return inOcean;
    }

    public void setInOcean(boolean inOcean) {
        this.inOcean = inOcean;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Humans extends Mammals {
    private int numberOffspring;

    public Humans (int numberOffspring){
        //super();
        this.numberOffspring = numberOffspring;
    }

}

class Main {
    public static void main(String[] args) {
        Mammals mam1 = new Mammals();
        mam1.setAge(12);
        mam1.setInOcean(true);
        mam1.setWeight(150);
        System.out.println("weight in pounds is: " + mam1.getWeight());
        System.out.println("weight in kilos is: " + mam1.weightInKilos());
        System.out.println(mam1.isAlive());
        System.out.println(mam1.getWeight());
        Humans human = new Humans(1);
        human.setHeight(100);
        System.out.println(human.getHeight());
        human.AAAAAA();

    }
}