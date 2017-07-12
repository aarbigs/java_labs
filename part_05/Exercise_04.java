package part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables. Class_02 must
 * also have at least 3 overloaded constructors. In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor. Each constructor should do something slightly differently. Class_02 must have at least
 * two private instance variables. Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */
class ClassA {
    public static void main(String[] args) {
        ClassB classb = new ClassB(1,2);
        System.out.println(classb.getNum3());
    }

}

class ClassB {
    private int num1;
    private int num2;
    private int num3;

    public ClassB(){}


    public ClassB(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public ClassB(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public ClassB(int num1) {
        this.num1 = num1;
    }

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