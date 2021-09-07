package challenge;

public class challenge3 {
    public static String getFirstElement(String[] names) {
        String FirstElement = names[0];
        return FirstElement;
    }
    public static void main(String[] args) {
        String[] nameList = {"Boris", "Constantin", "Melanie", "Analog", "Sky"};

        System.out.println(getFirstElement(nameList));

    }
}