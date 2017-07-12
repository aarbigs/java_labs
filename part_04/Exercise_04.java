package part_04;

class Exercise_04 {
    public static void main(String[] args) {
        int[][] dataArray = {
                {12, 45, 67},
                {8, 4, 13, -43, 98},
                {567, 1, 0, -2},
                {18, -456, 14, 6, 48, -80}
        };
        System.out.println(getMaxVal(dataArray));
        System.out.println(getMinVal(dataArray));
    }

    // iterate through array and determine max value in array
    public static int getMaxVal(int[][] dataArray) {
        int max = 0;
        for (int t = 0; t <= dataArray.length - 1; t++) {
            for (int i = 0; i <= dataArray[t].length - 1; i++) {
                if (dataArray[t][i] > max) {
                    max = dataArray[t][i];
                }
            }

        }
        return max;
    }


    //iterate through array and determine minimum value
    public static int getMinVal(int[][] dataArray) {
        int min = 0;
        for (int t = 0; t <= dataArray.length - 1; t++) {
            for (int i = 0; i <= dataArray[t].length - 1; i++) {
                if (dataArray[t][i] < min) {
                    min = dataArray[t][i];
                }
            }

        }
        return min;
    }
}