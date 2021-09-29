package animalcrossing;

public abstract class Animal {
    //instance variable, property, fields
    protected String food;

    //constructor
    public Animal(String food){
        this.food = food;
    }

    public void printAnimalFood(){
        System.out.println("Animal eats " + food);
    }


    //Abstract method
     public abstract void makeNoise();

    //overloaded method
    public void makeNoise(String noise ){
        System.out.println("making some " + noise);
    }

     //Polymorphic method
    public static void printAnimalNoiseAndWhatTheyEat(Animal[] listOfAnimals) {
        for (Animal animal : listOfAnimals) {
                animal.makeNoise();
                //we still need to solve the issue below
                animal.printAnimalFood();
        }
    }

    //Behaviors
    public static String eat(){
        return "what an animal eats";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                '}';
    }
}
