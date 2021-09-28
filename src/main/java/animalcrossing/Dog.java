package animalcrossing;
//Is-A relationship - Inheritance
public class Dog extends Canine implements IPet{


    public Dog(String food) {
        super(food);
    }

    @Override
    public void makeNoise(){
        System.out.println("wooof");
    }

   @Override
    public void printAnimalFood(){
        System.out.println("Dog eats " + food);
    }


    @Override
    public void greet() {
        System.out.println("smell your feet and lick your face");
    }

    public boolean fetch(){
        return  true;
    }
}
