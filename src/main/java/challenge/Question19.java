package challenge;

public class Question19 {
    public static void main(String[] args) {
        String wuTang = " The small brown dog hopped the fence ";

        System.out.println(replaceWuTangTwoThreeDivisible(wuTang));

    }

    public static String replaceWuTangTwoThreeDivisible(String stringInput) {
        String input = stringInput.replaceAll(" The small brown dog hopped the fence ", " The Wu Tang Wu Hopped Wu Fence ");

        return input;
    }
}
