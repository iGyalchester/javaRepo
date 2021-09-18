package Shape;

public class Rectangle {

    public double width, len, perimeter;

    public Rectangle(){ };

    public Rectangle(int width,int len){
        this.width = width;
        this.len = len;

    }
    public void thePerimiter (){
        this.perimeter = 2 * (width + len);
        System.out.println(perimeter);;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double widthInput) {
        this.width = widthInput;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", len=" + len +
                ", Perimiter=" + perimeter + "}";
    }

}
