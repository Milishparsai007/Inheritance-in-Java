class Rectangle1 {
    int length;
    int breadth;
    int x=10;
    Rectangle1(int length ,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
}

class Cuboid1 extends Rectangle1
{
    int height;
    int x=30;
    Cuboid1(int length,int breadth,int height)
    {
        super(length,breadth);
        this.height=height;
    }
    void display()
    {
        System.out.println(super.x);
        System.out.println(x);
    }
}

public class this_and_super {
    public static void main(String[] args) {
        Cuboid1 c=new Cuboid1(10,5,10);
        c.display();
    }

}
