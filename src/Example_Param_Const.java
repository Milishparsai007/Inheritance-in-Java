

class Rectangle {
    int length;
    int breadth;
    Rectangle()
    {
        length=1;
        breadth=1;
        System.out.println("Length : "+length+" Breadth : "+breadth);
    }
    Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
}

class Cuboid extends Rectangle
{
    int height;
    Cuboid()
    {
        height=1;
    }
    Cuboid(int h)
    {
        height=h;
    }

    Cuboid(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }

    public int volume()
    {
        return length*breadth*height;
    }
}

public class Example_Param_Const {
    public static void main(String[] args) {
        Cuboid c=new Cuboid();
        System.out.println("Volume : "+c.volume());
        System.out.println("");

        Cuboid c1=new Cuboid(3);
        System.out.println("Volume : "+c1.volume());
        System.out.println("");

        Cuboid c2=new Cuboid(10,10,10);   //this will call to Cuboid(int l,int b, int h) which in turn will give a call
                                                  //to Rectangle(int l,int b) via super(l,b)
        System.out.println("Volume : "+c2.volume());
    }
}
