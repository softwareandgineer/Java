// Inheritance
public class TwoDShape { //parent class
    private double width;
    private double length;

    TwoDShape()
    {
        width = length = 1.0;
    }
    TwoDShape(double w, double l)
    {
        setWidth(w);
        setLength(l);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    void showDimensions()
    {
        System.out.println("Width = " + width + " Length = " + length);
    }
}

class Triangle extends TwoDShape { //child class
    String style;

    Triangle()
    {
        super();
        style = "solid";
    }

    Triangle(String s, double w, double l){
        super(w, l);
        style = s;
    }

    double area()
    {
        return getWidth() * getLength() / 2.0;
    }

    void showStyle()
    {
        System.out.println("Style: " + style);
    }
}

class Shape{
    public static void main(String[] args)
    {
        Triangle t1 = new Triangle("solid", 100, 50);
        Triangle t2 = new Triangle("dot", 150, 20);
        Triangle t3 = new Triangle(); //default


        t1.showDimensions();
        t1.showStyle();
        System.out.println("t1's area is " + t1.area());

        t2.showDimensions();
        t2.showStyle();
        System.out.println("t2's area is " + t2.area());

        t3.showDimensions();
        t3.showStyle();
        System.out.println("t3's area is " + t3.area());
    }
}