package whileloop;

public class WhileLoopMethod {
    public static void main(String[] args) {
        System.out.println(untilDawn(1024, 2));

    }
    public static int untilDawn (double num1, double num2){
        //get our number
        //set our initial count to 0
        double number = num1;
        int count = 0;

        do {

            //while our number is greater than 1
            //divide the number by 2
            number = number / num2;

            //increase our count by 1
            count++;
            System.out.println(count);
            System.out.println(number + " Will be divided next \n");

        } while (number >= 1);
        return count;
    }
}
