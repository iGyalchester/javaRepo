package animalcrossing;

public class Wolf extends Canine {

    public Wolf(String food) {
        super(food);
    }

    @Override
    public void makeNoise() {
        System.out.println("oooowwwwllllll");
    }
}
