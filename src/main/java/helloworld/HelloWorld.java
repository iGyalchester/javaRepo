package helloworld;

public class HelloWorld {
    //Main method - black box -brain
    public static void main(String[] args) {

        //declare and assign
        int pickFour = 1234;

        //byte
        byte aBite = 120;
        System.out.println(aBite);
        //to do 7 more primitive data types
        short aShort = -3278;
        long aLong = 5446578;
        float aFloat = 25.44f;
        double aDouble = 3.14159265d;
        boolean aBoolean = true;
        char aChar = 'C';
        String aString = "yyyy";
        int aDouble2 = (int)aDouble;

        System.out.println(aChar);


        //Mini Lab
        // initializing variables
        int num1 = 20, num2 = 10, sub = 0;

        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // subtracting num1 and num2
        sub = num1 - num2;
        String text1 = "This is just a  \t simple text";
        String text2 = "This is just a  \n simple text";

        System.out.println("Subtraction = " + sub);
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(aFloat);

        System.out.println(aDouble2);

        int p = 50; double q = 2.0;
        var result = p * q;
        System.out.println(result);


        String firstName = "Boris";
        String lastname = "K.";
        String fullName = firstName + " " + lastname;

        System.out.println(fullName);

        String s = "Yo, Chill!";

        System.out.println(s.charAt(6));
    }

}
