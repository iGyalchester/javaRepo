package whileloop;

public class NestedWhileLoop {
    public static void main(String[] args) {

        int count = 0;
        int count2 = 0;
        while ( count != count2){
            int number = 1024;
            number = number / 2;

            count2++; //count = count + 1;
            System.out.println(number);
        }
        count = count2;
        System.out.println(" Count " + count);
    }
}
