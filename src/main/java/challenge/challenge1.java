package challenge;

public class challenge1 {

    public static int getLastIndex(String[] names) {
        int lastIndex = names.length-1;
        return lastIndex;
    }
    public static void main(String[] args) {
        String[] nameList = {"Boris", "Constantin", "Melanie", "Analog", "Sky"};

        System.out.println(getLastIndex(nameList));

    }
}

