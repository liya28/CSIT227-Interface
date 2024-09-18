interface PolygonInterface
{
    public double getArea();
    public double getPerimeter();
}

class Square implements PolygonInterface
{
    private double side;
    
    public Square(double side)
    {
        this.side = side;
    }
    
    public double getArea()
    {
        return side * side;
    }
    
    public double getPerimeter()
    {
        return 4 * side;
    }
}

class Rectangle implements PolygonInterface
{
    private double length;
    private double width;
    
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    
    public double getArea()
    {
        return length * width;
    }
    
    public double getPerimeter()
    {
        return 2 * (length + width);
    }
}

class Trapezoid implements PolygonInterface
{
    private double a;
    private double b;
    private double c;
    private double d;
    private double height;
    
    public Trapezoid(double a, double b, double c, double d, double height)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.height = height;
    }
    
     public double getArea()
    {
        return ((a + b) / 2.0) * height;
    }
    
    public double getPerimeter()
    {
        return a + b + c + d;
    }
}
// ang mouse diay huhuhuhu
