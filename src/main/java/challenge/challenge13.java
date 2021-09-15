package challenge;

public class challenge13 {
    public static void main(String[] args) {
        System.out.printf(printGivenStringTimesNumberGiven("Waterloo " + " ", 100));

    }
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        String repeat = str.repeat(n);

        return repeat;
    }
}
