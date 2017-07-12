package part_04;

/**

 Here's an easy one for you.

 Create and populate an array with a length no less than 5. Use the enhanced for
 loop to iterate through the array and print out each value.

 */
class dataArray {
    public static void main(String[] args) {
        int[] dataarray = new int[5];
        dataarray[0] = 0;
        dataarray[1] = 1;
        dataarray[2] = 2;
        dataarray[3] = 3;
        dataarray[4] = 4;

        for (int x : dataarray){
            System.out.println(x);
        }
    }
}