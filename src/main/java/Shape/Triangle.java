package Shape;

public class Triangle {
    public double base, height, Area;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;

        this.Area = (base * height) / 2.0;

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", Area=" + Area +
                '}';
    }
}
