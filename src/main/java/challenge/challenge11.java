package challenge;

public class challenge11 {
    public static int getIndexByElement(String[] names, String element) {
        int getIndex = 0;

        //simple iteration
        for (int i = 0; i < names.length; i++) {
            //use if statement to check if index == element
            if (names[i] == element) {
                //store the result in getIndex
                getIndex = i;
            }

        }
        return getIndex;
    }

    public static void main(String[] args) {
        String[] numList = {"60", "Critical", "Girth", "Length", "995"};

        System.out.println(getIndexByElement(numList, "Critical"));
/*
testing
*/

    }
}
