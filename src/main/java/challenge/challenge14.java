package challenge;

public class challenge14 {
    public static void main(String[] args) {
        System.out.println(repeatFirstThreeLetters("Waterloo ", 20));


    }
    public static String repeatFirstThreeLetters(String str, int n) {
        String substring = str.substring(0,3) + " ";

        return substring.repeat(n);

    }
}
