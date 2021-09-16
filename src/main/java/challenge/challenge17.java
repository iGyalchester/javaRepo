package challenge;

import java.util.Arrays;

public class challenge17 {
    public static void main(String[] args) {
        String[] numList = {"60", "Critical", "Girth", "Length", "995"};


        System.out.println(swap(numList));

    }

    public static String[] swap(String[] stringArray) {
        //Swap the first element in an array with the last element in an array and return
        String first = stringArray[0];
        String last = stringArray[stringArray.length -1];
        stringArray[0] = last;
        stringArray[stringArray.length -1] = first;
        String[] reversed = stringArray;



        return reversed;
    }
}
