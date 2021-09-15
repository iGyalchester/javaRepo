package challenge;

public class challenge5 {
    public static String getSecondToLastElement(String[] names) {
        String secondToLast = names[names.length -2];
        return secondToLast;
    }
    public static void main(String[] args) {
        String nameList[] = {"Boris", "Constantin", "Melanie", "Analog", "Sky"};

        System.out.println(getSecondToLastElement(nameList));

    }
}
