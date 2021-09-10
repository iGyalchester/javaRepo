package challenge;

public class challenge7 {
    public static double getAverage(int[] ints) {
        //sum of numbers in array
        double sum = 0;

        // iterate using a for loop
        for (int i = 0; i < ints.length; i++){
            // add elements to sum
            sum += ints[i];

        }
        double avg = sum / ints.length;

        return avg;
    }
    public static void main(String[] args) {
        int[] numList = {60, 30, 35, 86, 55, 375};

        System.out.println(getAverage(numList));

    }
}
