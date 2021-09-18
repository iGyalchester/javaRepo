package whileloop;

public class DoWhileLoop {
    public static void main(String[] args) {

        int number = 1024;
        int count = 0;
//      For example, say we want to know how many times a given number can be divided by 2 before it is less than or equal to 1.
        do {
            /*
             get our number
             set our initial count to 0
             while our number is greater than 1
             divide the number by 2
             increase our count by 1
             end
            */
            number = number / 2;

            count++; //count = count + 1;
            System.out.println(count);
            System.out.println("-------------------");

        } while (number >= 1);
    }
}
