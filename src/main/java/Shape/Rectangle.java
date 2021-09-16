package Shape;

public class Rectangle {

    public int width, len, perimeter;

    public Rectangle(){ };

    public Rectangle(int width,int len){
        this.width = width;
        this.len = len;

    }
    public void thePerimiter (){
        this.perimeter = 2 * (width + len);
        System.out.println(perimeter);;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", len=" + len +
                ", Perimiter=" + perimeter + "}";
    };

}
