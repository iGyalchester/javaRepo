package challenge;

public class challenge9 {
    public static String extractAllEvenNumbers(int[] numbers) {
        String evenNumbers = " ";
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0) {
                evenNumbers += numbers[i] + " ";
            }
        }
        return evenNumbers;
    }
    public static void main(String[] args) {
        int[] numList = {60, 30, 35, 86, 55, 375};

        System.out.println(extractAllEvenNumbers(numList));

    }
}
