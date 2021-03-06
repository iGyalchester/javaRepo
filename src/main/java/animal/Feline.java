package animal;

public abstract class Feline extends Animal{

    public Feline(String Name, String AnimalType, double Intelligence, double Power, double Mobility, double Health, double Stealth, double Weight) {
        super(Name, AnimalType, Intelligence, Power, Mobility, Health, Stealth, Weight);
    }

    public void eat (){
        System.out.println("Eat People");
    }

    @Override
    public String toString() {
        return "Feline{" +
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
