package whileloop;

public class NestedWhileLoop {
    public static void main(String[] args) {

        int num = 20;
        while (num >= 0){
            int subNum = num;
            while(subNum >= 0){
                System.out.print(subNum + " ");
                subNum--;
            }
            System.out.println();
            num--;
        }
    }
}
