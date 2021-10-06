package animal;

public abstract class Animal {
    public double
            Intelligence,
            Power,
            Defense,
            Mobility,
            Health,
            Stealth,
            Weight;

    public String Name, AnimalType;

    public Animal(String Name,String AnimalType,
                  double Intelligence,
                  double Power,
                  double Mobility,
                  double Health,
                  double Stealth,
                  double Weight){

        this.Name = Name;
        this.Intelligence = Intelligence;
        this.Power = Power;
        this.Mobility = Mobility;
        this.Health = Health;
        this.Stealth = Stealth;
        this.Weight = Weight;
        this.AnimalType = AnimalType;
    }
    public void eat (){
        System.out.println("Eating");
    }

    public static void main(Animal[] animals) {
        for (Animal animal :animals){
            animal.eat();
        }

    }

    @Override
    public String toString() {
        return "Animal{" +
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
