

class Parent1 {
    public Parent1()
    {
        System.out.println("Non-parameterized const of parent class");
    }
    public Parent1(int x)
    {
        System.out.println("Parameterized const of parent class "+x);
    }
}

class Child1 extends Parent1
{
    Child1()
    {
        System.out.println("Non-param const of child class");
    }
    Child1(int y)
    {
        System.out.println("Param const of child class");
    }

    //This const will give call to param const. of parent class
    Child1(int x,int y)
    {
        super(x); //this will invoke the parent class param const.
        System.out.println("Child class param const "+y);
    }
}

public class Parameterized_Const {
    public static void main(String[] args) {
        Child1 c=new Child1();
        //This will give a call to non-param const of child class which in turn gives a call to non-param const of child class.
        //So, first parent class non-param const will execute and then the child class non-param const.

        System.out.println("");
        //now let's call the param const of child class.
        Child1 c1=new Child1(10);
        //This will give a call to param const of child class which in turn gives a call to non-param const of parent class.
        //So, first parent class non-param const. will be executed and then the param const of child class.

        //If we want to execute param const. of parent class through child class then we have to create another const. inside
        //child class taking all the arguments of parent class const as well as its own arguments.
        //Then the very fisrt line of this const will be super(______);
        //let's check out

        System.out.println("");
        Child1 c2=new Child1(10,20);

    }
}
