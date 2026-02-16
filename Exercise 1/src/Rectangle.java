public class Rectangle {
    private double width =1;
    private double height= 1;

    public Rectangle() {

    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return (width*height);

    }
    public  double  getPerimeter(){
        return 2*(width+height);
    }
}
