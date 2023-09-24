
class Compile_Time{
    public int max(int a,int b)
    {
        return a>b?a:b;
    }
    public int max(int a,int b,int c)
    {
        if(a>b && a>c)
            return a;
        else if(b>c)
            return b;
        else
            return c;
    }
}

public class Compile_Time_Polymorphism {
    public static void main(String[] args) {
        Compile_Time comp=new Compile_Time();
        comp.max(10,12);
        comp.max(10,12,50);

        //here methods are written differently so it will be decided at compile time.
    }

}
