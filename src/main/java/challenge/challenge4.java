package challenge;

public class challenge4 {
    public static void main(String[] args) {
    String[] nameList = {"Boris", "Constantin", "Melanie", "Analog", "Sky"};

    System.out.println(getLastElement(nameList));

}
    public static String getLastElement(String[] names) {

        String lastElement = names[names.length -1];
        return lastElement;
    }

}
/*
1- declare STRING list
 */
