package challenge;

public class challenge12 {
    public static void printOddNumbersInRange(int start, int end){

        String oddNumber = " ";

        for (int i = start; i <=end; i+=2){
            oddNumber += i+ "\n";
        }
        System.out.println(oddNumber);
    }

    public static void main(String[] args) {

        printOddNumbersInRange(1, 50);

    }


}
