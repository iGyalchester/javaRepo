package helloworld;
import java.util.*;
import java.lang.*;
import java.io.*;
public class hollowed {
    public static void main(String[] args) {
//        String Product = "Mug";
//        String Message = "Thank you. Come Again!!!";
//        int Qty = 20;
//        double Price = 5.0;
//        double Total = Qty * Price;
//
//        System.out.println("Product\t Qty\t Price\t Total");
//        System.out.println("----\t ---\t -----\t -----");
//        System.out.println(Product + "\t\t" + Qty + "\t\t" + Price + "\t\t" + Total);
//        System.out.println("\t" + Message);

//        String s ="Year";
//        String newString = s.concat("Up");//concat() method appends the string at the end
//        System.out.println(s);// strings are immutable objects - prints only Year
//
//        // Object was  not modified instead a new object was created with YearUp
//        String resultOfConcat =  s.concat("Up");
//        System.out.println(resultOfConcat);
//
//        String firstName = "Christopher";
//        String substring = firstName.substring(0, 5);
//        String subSting2 = firstName.substring(4,8);
//        byte[] reversed = subSting2.getBytes();
//        byte[] result = new byte[reversed.length];
//
//        System.out.println(substring);
//        System.out.println(subSting2);
//        System.out.println(subSting2);
//        for (int i = 0; i < reversed.length; i++)
//            result[i] = reversed[reversed.length - i - 1];
//        System.out.println(new String.toUpperCase(result));
        //code to get input from user, and you save it into temperature.
//        Scanner temperature = new Scanner(System.in);
//        System.out.println("Is it Low, humid or high?");
//        //After user inputs
//        String input = temperature.nextLine();
//        System.out.printf("It is %s! ", input);
//
//        if (input.equals("High")){
//            System.out.println("sunblock may be needed!");
//
//        } else if (input.equals("Low")){
//            System.out.println("A coat may be needed!");
//
//        }else if (input.equals("Humid")){
//            System.out.println("Dress Accordingly!");
//
//        }else {
//            System.out.println("Please enter, Low, High or Humid!");
//        }

        // We are writing a program that checks if a randomly generated number is greater than 0
        //if the generated number is greater than 0 and less than 10..print out number is greater than 0 and less than 10
        //you must use a nested if statement3

        int randomNum = (int)(Math.random() * 10);

        if (randomNum >= 0){
            if (randomNum < 10){
                System.out.println(randomNum + " is greater than 0 and less than 10");
                if (randomNum > 2 + 5){
                    System.out.println("Number is bigger than 2!");
                }
                else{
                    System.out.println("Keep trying!");

                }
            }
        }



    }
}
