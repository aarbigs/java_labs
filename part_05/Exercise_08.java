package part_05;

/**
 * Write one class. This class must make use of an inner/nested class. Within the nested class, set the instance variables
 * of the outer class. Also, within the inner class, call at least two methods that have a return type of int. Add these
 * two ints together and set a final instance variable in the outer with this value.
 */


class Outer{
    static public int x;
    static public int y;

    public static void main(String[] args) {
        Inner innie = new Inner();

        x = y = 1;
        int one = innie.addition();
        System.out.println(one);
        int two = innie.multiplication();
        System.out.println(two);
        innie.callOuter();

    }

    static class Inner{

        public int addition (){
            System.out.println("in addition");
            return x + y;
        }

        public int multiplication (){
            System.out.println("in multiplication");
            return x * y;
        }

        public void callOuter (){
            System.out.println("calling outer");
            outer();
        }
    }

    public static void outer() {
        System.out.println("in outer");
    }



}