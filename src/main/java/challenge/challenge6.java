package challenge;

public class challenge6 {
    public static int getSum(int[] ints) {
        //sum of numbers in array
        int sum = 0;

        // iterate using a for loop
        for (int i = 0; i < ints.length; i++){
            // add elements to sum
            sum += ints[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] numList = {60, 30, 35, 86, 55, 375};

        System.out.println(getSum(numList));

    }
}
