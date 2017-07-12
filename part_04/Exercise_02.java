package part_04;

/**

 Use a for loop to count to 2017. While looping, populate an array with the
 value of your iterator (ie, i). Once populated, print out the odd values
 (ie, 2017, 2015, 2013) of the array in reverse order.

 */

class CountTo2017 {
    public static void main(String[] args) {
        int[] countup = new int[2018];
        for (int i = 1; i < 2018; i++){
            countup[i] = i;
        }
        for (int j = countup.length-1; j >=0; j-=2){
            System.out.println(countup[j]);
        }
    }
}
