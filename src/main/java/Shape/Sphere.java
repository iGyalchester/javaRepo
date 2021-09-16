package Shape;

public class Sphere {
    public double radius, height, Pi, Area;
    public Sphere(){ };

    public Sphere(double radius){
        this.radius = radius;
        this.height = height;
        this.Pi = 3.14;
        this.Area = 4 * (Pi * Math.pow(radius, 2));

    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                ", Area=" + Area +
                '}';
    }
}
