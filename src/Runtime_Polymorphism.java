
class Sup{
    public void display()
    {
        System.out.println("Superclass display");
    }
}

class SubClass extends Sup
{
    @Override
    public void display()
    {
        System.out.println("Subclass display");
    }
}

public class Runtime_Polymorphism {
    public static void main(String[] args) {

//        Sup s1=new Sup();
//        s1.display();

        Sup s1=new SubClass();
        s1.display();

        //here method call is same i.e., s1.display() but which method to call it depends on the object that is being passed.
        //hence it is decided at runtime.
    }
}
