package part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 should have various instance variables. At least one of
 * must be static. Within class_01 create at least 3 instances of class_02. Set the instance variables of class_02. Then,
 * just once, in one place, set the static instance variable in class_02. Afterwards, print out the value of each instance
 * variable and the static variable for each class.
 */

class Class07_A{
    public static void main(String[] args) {
        Class07_B class1 = new Class07_B();
        Class07_B class2 = new Class07_B();
        Class07_B class3 = new Class07_B();
        class2.setNum2(2);
        System.out.println(class2.getNum2());
        class3.setNum3(3);
        System.out.println(class3.getNum3());
        Class07_B.setNum1(1);
        System.out.println(Class07_B.getNum1());
    }

}

class Class07_B {
    static int num1;
    private int num2;
    private int num3;

    public static int getNum1() {
        return num1;
    }

    static void setNum1(int num1) {
        Class07_B.num1 = num1;
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
}