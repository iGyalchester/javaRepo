package challenge;

public class challenge8 {
    public static String extractAllOddNumbers(int[] numbers) {
        String oddNumbers = " ";
        for (int num : numbers){
            if (num % 2 != 0) {
                oddNumbers += num + " ";
            }
        }
        return oddNumbers;
    }
    public static void main(String[] args) {
        int[] numList = {60, 30, 35, 86, 55, 375};

        System.out.println(extractAllOddNumbers(numList));

    }
}
