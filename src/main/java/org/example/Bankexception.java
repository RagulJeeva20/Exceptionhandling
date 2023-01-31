package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.*;
public class Bankexception
{
    String name;
    int accno;
    int balance;
    Logger l=Logger.getLogger("tyler");
    Scanner s=new Scanner(System.in);
    Scanner c=new Scanner(System.in);
    Bankexception()
    {

        l.info("enter name:");
        String a=c.next();
        try {


            l.info("enter account no:");
            accno = s.nextInt();
        }
        catch (InputMismatchException i)
        {
            l.info("wrong datatype");
            l.info(String.valueOf(i));

        }
        name=a;
        balance=0;
    }
    void show()
    {
        l.log(Level.INFO, () ->"name:" + name + " " + "acc no:" + accno + " " + "balance:" +balance);
    }
    void deposit()
    {
        l.info("money you want to deposit");
        int a=s.nextInt();
        balance=balance+a;
        l.info("your money has been credited");
        l.info("what you want to do now?\n 1.deposit \n2.withdrawl \n3.exit");
        l.info("select:");
        int sel=s.nextInt();
        if (sel==1)
        {
            deposit();
        }
        if (sel==2)
        {
            withdrawl();
        }
        if (sel==3)
        {
            show();
        }
    }
    void withdrawl()
    {
        l.info("money you want to withdrawl");
        int b=s.nextInt();
        if (b>balance)
        {
            l.info("you dont have enough money to withdrawl");
        }
        else
        {
            balance=balance-b;
        }
        l.info("your money has been debited");
        l.info("what you want to do now?\n 1.deposit \n2.withdrawl \n3.exit");
        l.info("select:");
        int sel=s.nextInt();
        if (sel==1)
        {
            deposit();
        }
        if (sel==2)
        {
            withdrawl();
        }
        if (sel==3)
        {
            show();
        }
    }
    public static void main(String[] args)
    {
        Bankexception ragul=new Bankexception();
        ragul.deposit();
    }
}