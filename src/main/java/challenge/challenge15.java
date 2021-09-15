package challenge;

public class challenge15 {
    public static void main(String[] args) {
        System.out.println(WordsInAStringCounter("Alcatraz"));

    }
    public static int WordsInAStringCounter(String str){
        //initialize counter
        int count = 0;

        //CONVERT STRING TO ARRAY
        char letters[] = str.toCharArray();
        for(char letter : letters){
            count++;
        }

        return count;
    }
}
