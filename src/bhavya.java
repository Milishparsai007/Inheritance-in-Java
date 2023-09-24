
class A
{
    int i,j=0;
    public A(int a,int b)
    {
        i=a;
        j=b;
    }
    void show()
    {
        System.out.println("i and j : "+i+j);
    }
}

class B extends A
{
    int k=0;
    public B(int a,int b,int c)
    {
        super(a,b);
        k=c;
    }
    @Override
    void show()
    {
        System.out.println("K : "+k);
    }
}

public class bhavya {
    public static void main(String[] args) {

        B b1=new B(1,2,3);
        b1.show();
    }
}
