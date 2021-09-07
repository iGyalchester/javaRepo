package challenge;

public class challenge2 {
    public static int getSecondToLastIndex(String[] names) {
        int secondToLast = names.length - 2;
        return secondToLast;
    }
    public static void main(String[] args) {
        String[] nameList = {"Boris", "Constantin", "Melanie", "Analog", "Sky"};

        System.out.println(getSecondToLastIndex(nameList));

    }
}
