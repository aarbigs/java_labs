package part_05;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */


class Class_01{
    public static void main(String[] args) {
        System.out.println("in main - calling constructor...");
        Class_02 class_02 = new Class_02(1, 2.0, "hello");
        System.out.println(class_02.getA());
        System.out.println("back in Class_01 main() method - about to set class_03's variables using the class_02 " +
                "object....");
        class_02.setClass03Variables("world", 100.0);
    }
}

class Class_02{
    private int a;
    private double b;
    private String c;
    Class_03 class_03;

    public Class_02(int a, double b, String c) {
        System.out.println("in class_02 constructor...");
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("in class_02 constructor - creating class_03 object...");
        class_03 = new Class_03(2.0, "test");
        System.out.println("all done!");
    }

    public void setClass03Variables(String s, double num){
        System.out.println("in class_02 setClass03Variables() - setting class_03 objects...");
        class_03.setS(s);
        class_03.setX(num);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}

class Class_03{
    private double x;
    private String s;

    public Class_03(double x, String s) {
        System.out.println("in class_03 constructor...");
        this.x = x;
        this.s = s;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}