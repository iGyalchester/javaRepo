package animal;

public class Dog extends Canine{

    public Dog(String Name, String AnimalType, double Intelligence, double Power, double Mobility, double Health, double Stealth, double Weight) {
        super(Name, AnimalType, Intelligence, Power, Mobility, Health, Stealth, Weight);
    }

    public void eat (){
        System.out.println("Eating");
    }

    public boolean fetch(){
        return true;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Intelligence=" + Intelligence +
                ", Power=" + Power +
                ", Defense=" + Defense +
                ", Mobility=" + Mobility +
                ", Health=" + Health +
                ", Stealth=" + Stealth +
                ", Weight=" + Weight +
                ", Name='" + Name + '\'' +
                ", AnimalType='" + AnimalType + '\'' +
                '}';
    }
}
