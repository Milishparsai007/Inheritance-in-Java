class Account
{
    private String Acc_no;
    private String name;
    private String Acc_type;
    private double balance;

    //property methods
    public String getAcc_no()
    {
        return Acc_no;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public String getName()
    {
        return name;
    }
    public String getAcc_type()
    {
        return Acc_type;
    }
    public void setAcc_type(String Acc_type)
    {
        this.Acc_type=Acc_type;
    }

    //constructors
    public Account()
    {

    }
    public Account(String Acc_no,String name,String Acc_type)
    {
        this.Acc_no=Acc_no;
        this.name=name;
        this.Acc_type=Acc_type;
    }
    public Account(String Acc_no,String name,String Acc_type,double balance)
    {
        this.Acc_no=Acc_no;
        this.name=name;
        this.Acc_type=Acc_type;
        this.balance=balance;
    }

    public String toString()
    {
        return "\nAccount number : "+getAcc_no()+"\nAccount holder name : "+getName()+"\nAccount type : "+getAcc_type();
    }
}

class Savings extends Account
{
    double dep_amt,with_amt,fd_amt;
    //property methods
    public double getDep_amt()
    {
        return dep_amt;
    }
    public void setDep_amt(double dep_amt)
    {
        this.dep_amt=dep_amt;
    }

    public double getWith_amt()
    {
        return with_amt;
    }
    public void setWith_amt(double with_amt)
    {
        this.with_amt=with_amt;
    }

    public double getFd_amt()
    {
        return fd_amt;
    }
    public void setFd_amt(double amount)
    {
        fd_amt=amount;
    }

    //methods
    public void Deposit(double amount)
    {
        if(amount>=0)
        {
            dep_amt=getBalance()+amount;  //this get the current balance in the account and adds the deposit amount to it.
            setBalance(dep_amt);// this sets the new amount including the deposited amount as balance.
        }
        else
        {
            System.out.println("Invalid amount");
        }
    }

    public void Withdraw(double amount)
    {
        if (amount<=getBalance() && amount>=0)
        {
            with_amt=getBalance()-amount;  // this will accept the amount to be withdrawn and will subtract that amount from balance
            setBalance(with_amt);          // this will set the new balance after withdrawing the amount.
        }
    }

    //constructor


    public String toString()
    {
        return "\nBalance : "+getBalance();
    }
}

class Loan extends Account
{
    double sanc_amt,emi,int_rate,pay;

    //property methods
    public double getSanc_amt()
    {
        return sanc_amt;
    }

    public double getEmi()
    {
        return emi;
    }
    public double getInt_rate()
    {
        return int_rate;
    }

    //methods
    public void payEmi(double amount)
    {
        if(amount<=sanc_amt)
        {
            pay=getBalance()-amount;
            setBalance(pay);
        }
    }

    //constructor
    public Loan(double amount,double int_rate,double emi)
    {
        sanc_amt=amount;
        setBalance(sanc_amt);
        this.int_rate=int_rate;
        this.emi=emi;
    }
    public String toString()
    {
        return "\nSanction amount : "+getSanc_amt()+"\nBalance : "+getBalance()+"\nInterest rate : "+getInt_rate()
                +"\nEMI : "+getEmi();
    }

}

class Test1
{
    public static void main(String[] args) {

        Account A1=new Account("30710110000007","Milish Parsai","Savings");
        Account A2=new Account("60710510000007","Milish Parsai","Loan");
        System.out.println(A1);
        System.out.println(A2);

        Savings S1=new Savings();
        S1.Deposit(50000);
        System.out.println(A1+""+S1);
        S1.Withdraw(25000);
        System.out.println(A1+""+S1);

        Loan L1=new Loan(1000000,9.5,2500);
        System.out.println(A2+""+L1);
        L1.payEmi(50000);
        System.out.println(A2+""+L1);

        Account A3=new Account("307101100005122","ABCD","Savings",55000000);
        System.out.println(A3.getBalance());

    }
}