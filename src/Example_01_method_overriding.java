class oldTV{
    public void switchON()
    {
        System.out.println("Old TV is switched on");
    }
    public void changeChannel()
    {
        System.out.println("Old TV channel is changed");
    }
}

class smartTV extends oldTV{
    @Override
    public void switchON()
    {
        System.out.println("Smart TV is switched on");
    }

    @Override
    public void changeChannel()
    {
        System.out.println("Smart TV channel is changed");
    }
    public void browse()
    {
        System.out.println("Smart TV is browsing");
    }
}public class Example_01_method_overriding {
    public static void main(String[] args) {

        oldTV ot=new oldTV();
        ot.switchON();
        ot.changeChannel();

        smartTV st=new smartTV();
        st.switchON();
        st.changeChannel();
        st.browse();

        oldTV t1=new smartTV();
        t1.switchON();
        t1.changeChannel();
//        t1.browse();   //this will give error because the reference of superclass only knows about the features of the super class and not about
                        // the features of subclass.
    }
}
