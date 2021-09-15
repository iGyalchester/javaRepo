package challenge;

public class challenge16 {
    public static void main(String[] args) {
        System.out.println(VowelsCounter("Gummybears"));

    }
    public static int VowelsCounter(String str){
        int counter = 0;

        for (int i = 0; i < str.length(); i++){
            //convert charachter to lower case before comparing it.
            if(Character.toLowerCase(str.charAt(i)) == 'a'
                    || Character.toLowerCase(str.charAt(i)) == 'e'
                    || Character.toLowerCase(str.charAt(i)) == 'i'
                    || Character.toLowerCase(str.charAt(i)) == 'o'
                    || Character.toLowerCase(str.charAt(i)) == 'u'
                    || Character.toLowerCase(str.charAt(i)) == 'y'){
                counter ++;
            }

        }

        return counter;
    }
}
