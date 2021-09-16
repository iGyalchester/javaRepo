package Shape;

public class Circle {

    public double diameter, radius, Circumference, Area, Pi;

    public Circle(){ };

    public Circle(double radius){
        this.diameter = diameter;
        this.radius = radius;
        this.Pi = 3.14d;
        this.Circumference = 2 *(Pi * radius);
        this.Area = Pi * (Math.pow(radius, 2));

    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius +
                ", Circumference=" + Circumference +
                ", Area=" + Area +
                '}';
    }
}
