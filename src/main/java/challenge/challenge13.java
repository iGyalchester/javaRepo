package challenge;

public class challenge13 {
    public static void main(String[] args) {
        System.out.printf(printGivenStringTimesNumberGiven("Waterloo " + "\n", 20));

    }
    public static String printGivenStringTimesNumberGiven(String str, int n) {

        return str.repeat(n);
    }
}
