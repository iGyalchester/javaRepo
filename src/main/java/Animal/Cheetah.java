package Animal;

public class Cheetah {

    public double
            Intelligence,
            Power,
            Defense,
            Mobility,
            Health,
            Stealth;
    public String Name;

    public Cheetah(){}

    public Cheetah(String Name,
                   double Intelligence,
                   double Power,
                   double Mobility,
                   double Health,
                   double Stealth){

        this.Name = Name;
        this.Intelligence = Intelligence;
        this.Power = Power;
        this.Mobility = Mobility;
        this.Health = Health;
        this.Stealth = Stealth;
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
                ", Name='" + Name + '\'' +
                '}';
    }
}
