package part_05;

/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you ust manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 *
 */

class Class_1{
    public static void main(String[] args) {
        Class_2 class2ob = new Class_2();
        System.out.println(class2ob.multiply2());
        class2ob.setNum1(2);
        System.out.println(class2ob.multiply2());
        class2ob.setNum2(3);
        System.out.println(class2ob.multiply2());
        class2ob.setNum3(4);
        System.out.println(class2ob.multiply2());
        System.out.println("");
        System.out.println(class2ob.getNum2());
        System.out.println("");
        System.out.println(class2ob.getNum3());
        System.out.println("");
        class2ob.method_02();
        class2ob.printNum2();
    }

}

class Class_2 {
    private int num1 = 1;
    private int num2 = 2;
    private int num3 = 3;

    Class_1 class1num = new Class_1();

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public Class_1 getClass1num() {
        return class1num;
    }

    public void setClass1num(Class_1 class1num) {
        this.class1num = class1num;
    }

    public int multiply2(){
        return num1 * num2;
    }

    public int method_02(){
        return num1++;
    }

    public void printNum2(){
        System.out.println("heh heh" + num2);
    }

}
