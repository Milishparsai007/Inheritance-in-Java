class Superclass {
    public void meth1()
    {
        System.out.println("Super meth1");
    }
    public void meth2()
    {
        System.out.println("Super meth2");
    }
}

class Subclass extends Superclass{
    @Override
    public void meth2()
    {
        System.out.println("Sub meth2");
    }
    public void meth3()
    {
        System.out.println("Sub meth3");
    }

}

public class Dynamic_method_dispatch {
    public static void main(String[] args) {

//        Superclass sup1=new Superclass();
//        sup1.meth1();
//        sup1.meth2();
//        Subclass sub1=new Subclass();
//        sub1.meth1();  //from Superclass
//        sub1.meth2();
//        sub1.meth3();

        Superclass sup=new Subclass();
        sup.meth1();
        sup.meth2();
    }
}