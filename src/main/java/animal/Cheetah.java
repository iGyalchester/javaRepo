package animal;

public class Cheetah extends Animal{

    public Cheetah(String Name, String AnimalType, double Intelligence, double Power, double Mobility, double Health, double Stealth, double Weight) {
        super(Name, AnimalType, Intelligence, Power, Mobility, Health, Stealth, Weight);
    }

    @Override
    public String toString() {
        return "Cheetah{" +
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
