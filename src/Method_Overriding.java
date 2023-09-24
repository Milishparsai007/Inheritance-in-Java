class Super {
    public void display()
    {
        System.out.println("Super class display");
    }
}

class Sub extends Super{
    @Override  // this is for representing that this method is overriden
    public void display()
    {
        System.out.println("Sub class display");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {

        Super su=new Super();
        su.display();  // this will call the display method of superclass.

        Sub sub=new Sub();
        sub.display();  //this will call the display method of subclass.
        //the reference sub will contain both the methods display() of super and subclass but the method display() of superclass is shadowed
        //because a class cannot contain same methods.

        //Note :- For method overriding we have to use same signature of method in subclass as in superclass.

        //Dynamic method dispatch
        //it means when an superclass reference contains an object of subclass and an overriden method is called,
        //then the method of object is called and not the method of reference .

        Super s1=new Sub();
        s1.display();
        //this will call the display method of Sub class
    }
}
