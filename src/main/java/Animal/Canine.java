package Animal;

public abstract  class Canine extends Animal{

    public Canine(String Name, String AnimalType, double Intelligence, double Power, double Mobility, double Health, double Stealth, double Weight) {
        super(Name, AnimalType, Intelligence, Power, Mobility, Health, Stealth, Weight);
    }

    @Override
    public String toString() {
        return "Canine{" +
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
