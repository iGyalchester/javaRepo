package challenge;

public class challenge2 {
    public static int getSecondToLastIndex(String[] names) {
        //crated a variable to hold secontolast index
        //
        int secondToLast = names.length - 2;
        return secondToLast;
    }
    public static void main(String[] args) {
        String[] nameList = {"Boris", "Constantin", "Melanie", "Analog", "Sky"};

        System.out.println(getSecondToLastIndex(nameList));

    }
}