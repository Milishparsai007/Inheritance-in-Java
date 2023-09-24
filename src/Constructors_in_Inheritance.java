class Parent {
    public Parent()
    {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent
{
    public Child()
    {
        System.out.println("Child constructor");
    }
}

class GrandChild extends Child
{
    public GrandChild()
    {

        System.out.println("Grand child constructor");
    }
}

public class Constructors_in_Inheritance {
    public static void main(String[] args) {
//        Child c1=new Child();   //this will invoke child class constructor which in return will invoke parent class constructor
                                 //so, at first the parent class constructor will execute first then child class constructor.
        GrandChild g1=new GrandChild();
        //same goes for grandchild. First the parent class then child class and at last grandchild class constructor.
    }
}
