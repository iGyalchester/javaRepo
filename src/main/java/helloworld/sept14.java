package helloworld;

import java.util.Arrays;

public class sept14 {

    public static double calculateDiscount(double price, double discount ){

        double discounted = price - ((price * discount)/ 100);


        return discounted;
    }
    public static void main(String[] args) {

        System.out.println(calculateDiscount(10.0, 10.0));

    }
}
