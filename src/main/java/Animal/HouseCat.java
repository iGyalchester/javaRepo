package Animal;

public class HouseCat extends Feline{


    public HouseCat(String Name, String AnimalType, double Intelligence, double Power, double Mobility, double Health, double Stealth, double Weight) {
        super(Name, AnimalType, Intelligence, Power, Mobility, Health, Stealth, Weight);
    }
    public boolean scratch(){
        return true;
    }
    @Override
    public String toString() {
        return "House Cat{" +
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
