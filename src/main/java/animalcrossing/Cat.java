package animalcrossing;
public class Cat extends Feline implements IPet{

    public Cat(String food) {
        super(food);
    }

    @Override
    public void printAnimalFood(){
        System.out.println("Cat eats " + this.food);
    }

    @Override
    public void makeNoise(){
        System.out.println("meooow");
    }

    @Override
    public void greet() {
        System.out.println("scratch ya face");
    }

    public boolean scratch(){
        return  true;
    }


}
