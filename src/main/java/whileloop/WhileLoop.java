package whileloop;

public class WhileLoop {
    public static void main(String[] args) {
        /*
        The While Loop:
        The while loop is  a control flow statement (the order in which the computer executes statements)
         that allows code to be executed repeatedly based on a given Boolean condition.
        For example, say we want to know how many times a given number can be divided by 2 before it is less than or equal to 1.
         */
        int number = 1024;//get our number
        int count = 0;//set our initial count to 0
        while (number >= 1)//while our number is greater than 1
        {
            number = number / 2;//divide the number by 2

            count++; //count = count + 1;//increase our count by 1
            System.out.println(count);
            System.out.println("-------------------");
            System.out.println(number);

            /*
              get our number
              set our initial count to 0
              while our number is greater than 1
              divide the number by 2
              increase our count by 1
              end
             */
        }//end. repeats until condition is met. >= 1 is met


    }
}
