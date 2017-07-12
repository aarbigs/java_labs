package part_05;

/**
 * Write two classes. In Class_01 have a main method that creates on instance of Class_02. In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void. Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */

class Class1{
    public static void main(String[] args) {
        Class2 class2ob = new Class2();
        System.out.println(class2ob.multiply2());
        System.out.println("");
        System.out.println(class2ob.multiply2(10));
        System.out.println("");
        System.out.println(class2ob.multiply2(2,10));
    }

}

class Class2 {
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

    public int multiply2(int a, int b){
        return a * b;
    }

    public int multiply2(int a){
        return a * num1;
    }
}