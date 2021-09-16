package Shape;

public class Square {

    public double Side, Area;

    public Square(double Side){
        this.Side = Side;
    }
    public void theArea (){
        this.Area = Math.pow(Side, 2);
        System.out.println(Area);;
    }

    @Override
    public String toString() {
        return "Square{" +
                "Side=" + Side +
                ", Area=" + Area +
                '}';
    }
}
