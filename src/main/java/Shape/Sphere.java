package Shape;

public class Sphere {
    public double radius, height, Pi, Area;
    public Sphere(){ };


    public Sphere(double radius){
        this.radius = radius;
        this.height = height;
        this.Pi = Math.PI;
    }

    public void theArea (){
        this.Area = 4 * (Pi * Math.pow(radius, 2));
        System.out.println(Area);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                ", Area=" + Area +
                '}';
    }
}
