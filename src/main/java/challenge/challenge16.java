package challenge;

public class challenge16 {
    public static void main(String[] args) {
        System.out.println(VowelsCounter("Vowels"));

    }
    public static int VowelsCounter(String str){

        String[] vowels = {"A", "E", "I", "O", "U", "Y"};
        int counter = 0;

        for (String vowel : vowels){
            //convert charachter to lower case before comparing it.
            if(str.equalsIgnoreCase(vowel)){
                counter ++;
            }

        }

        return counter;
    }
}
