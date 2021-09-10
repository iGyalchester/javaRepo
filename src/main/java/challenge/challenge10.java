package challenge;

public class challenge10 {

    public static void main(String[] args) {
        String[] numList = {"60", "Critical", "Girth", "Length", "995"};


        System.out.println(contains(numList, "60"));

    }
    public static boolean contains(String[] names, String element) {


        for (String name : names ){
            if (name.equals(element)) {
                return true;
            }
        }
        return false;
    }
}
/*
1 - create string array
2 -
 */