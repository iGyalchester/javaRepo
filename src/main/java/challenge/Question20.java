package challenge;

import java.util.Arrays;

public class Question20 {
    public static String createStringOfFibonnaciUpToMax(int maxnumber) {
        //initialize num1 and num2 which are 0 and 1.
        //num1 and num2 never change
        int num1 = 0, num2 = 1, sum = 0;
        String result = " ";


        for (int i = 1; i < maxnumber; i++){

            sum = num1 + num2;//sum now = 2
            num1 = num2; //now 1
            num2 = sum;// now 2 and repeats from line 13 until max is reached.
            result = String.valueOf(sum); //convert sum to string and store it into result

        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println((createStringOfFibonnaciUpToMax(20)));
    }
}
