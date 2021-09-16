package Shape;

public class Rectangle {

    public int width, len, perimeter;

    public Rectangle(){ };

    public Rectangle(int width,int len){
        this.width = width;
        this.len = len;

        this.perimeter = 2 * (width + len);

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", len=" + len +
                ", Perimiter=" + perimeter + "}";
    };

}
