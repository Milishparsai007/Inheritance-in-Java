
class Circle{
    public double radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }

}

class Cylinder extends Circle
{
    public double height;
    public double volume()
    {
        return area()*height;
    }
}

class Test {
    public static void main(String[] args)
    {
        Cylinder c1=new Cylinder();
        c1.height=10;
        c1.radius=5;
        System.out.println("Volume: "+c1.volume());
        System.out.println("Area : "+c1.area());
        Circle c2=new Circle();
        c2.radius=5;
//        System.out.println(c2.volume());  //this is not valid because Circle class is superclass and it cannot access the
                                             // methods of Cylinder class.
    }
}