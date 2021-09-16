package Shape;

public class CallShape {
    public static void main(String[] args) {
        Rectangle fourcorners1 = new Rectangle(20,25);
        Circle round = new Circle(20.0);
        Sphere sphere1 = new Sphere(30.0);
        Triangle tri1 = new Triangle(60.0, 30.0);
        Square sqr1 = new Square(30);

        System.out.println(fourcorners1);
        System.out.println("---------------------");

        System.out.println(round);
        System.out.println("---------------------");

        System.out.println(sphere1);
        System.out.println("---------------------");

        System.out.println(tri1);
        System.out.println("---------------------");

        sqr1.theArea();
    }

}
