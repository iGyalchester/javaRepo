package challenge;

public class challenge7 {
    public static int getAverage(int[] ints) {
        //sum of numbers in array
        int avg = 0;

        // iterate using a for loop
        for (int num : ints){
            // add elements to sum
            avg += num / ints.length;

        }
        return avg;
    }
    public static void main(String[] args) {
        int[] numList = {60, 30, 35, 86, 55, 375};

        System.out.println(getAverage(numList));

    }
}
