package helloworld;

public class tensing {
    public static void main(String[] args) {
        for(int x = 1; x < 4; x++){
            System.out.println("outer loop =>: " + x);
            for(int y = 1; y < 4; y++){
                System.out.println("inner loop: " + y);
            }
        }
    }
}
