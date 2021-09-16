package Shape;

public class Circle {

    public double diameter, radius, Circumference, Area, Pi;

    public Circle(){ };
    private static final double PI = 3.14;

    public Circle(double radius){
        this.diameter = diameter;
        this.radius = radius;
        this.Pi = PI;


    }
    public void findCircumference (){
        this.Circumference = 2 *(Pi * radius);
        System.out.println(Circumference);;
    }
    public void theArea (){
        this.Area = Pi * (Math.pow(radius, 2));
        System.out.println(Area);
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius +
                ", Circumference=" + Circumference +
                ", Area=" + Area +
                '}';
    }
}
