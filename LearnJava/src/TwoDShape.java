// Inheritance
abstract public class TwoDShape { //parent class
    private double width;
    private double length;

    abstract double area();

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

    void draw()
    {
        System.out.println("2D Shape drawing mechanic not implemented yet");
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

    void draw()
    {
        System.out.println("Triangle drawing mechanic not implemented yet");
    }
}

final class ColoredTriangle extends Triangle // final = cannot inherit from this class
{
    static public final String RED_COLOR = "red"; // final = variable cannot be changed; value is constant
    String color;
    ColoredTriangle(String c)
    {
        this.color = c;
    }
    void showColor()
    {
        System.out.println("Color = " + color);
    }
    void draw()
    {
        System.out.println("Colored Triangle drawing mechanic not implemented yet");
    }
}


class Shape{
    public static void main(String[] args)
    {
        Triangle t1 = new Triangle("solid", 100, 50);
        Triangle t2 = new Triangle("dot", 150, 20);
        Triangle t3 = new Triangle(); //default
        ColoredTriangle t4 = new ColoredTriangle(ColoredTriangle.RED_COLOR);

        TwoDShape[] shapes = new TwoDShape[4];
        shapes[0] = t1;
        shapes[1] = t2;
        shapes[2] = t3;
        shapes[3] = t4;

        for(int i = 0; i < 4; i++)
            shapes[i].draw();




        /* t1.showDimensions();
        t1.showStyle();
        System.out.println("t1's area is " + t1.area());

        t2.showDimensions();
        t2.showStyle();
        System.out.println("t2's area is " + t2.area());

        t3.showDimensions();
        t3.showStyle();
        System.out.println("t3's area is " + t3.area());
        t3.draw();

        t4.showColor();
        t4.draw(); */
    }
}