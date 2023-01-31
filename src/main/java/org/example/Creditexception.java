package org.example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Creditexception implements cloneable
{
    Logger l=Logger.getLogger("tyler");

    Integer cardno;
    String name;
    Integer date;

    Integer cardnum;

    Creditexception(Integer a)
    {
        name="ragul";
        cardno=1234;
        date=2025;
        this.cardnum=a;

    }
    boolean eq()
    {
        return (cardno.equals(cardnum));
    }
    void show()
    {
        l.log(Level.INFO, () ->"your name:" + name);
        l.log(Level.INFO, () ->"your card number:"+ cardnum);
        l.log(Level.INFO, () ->"expiry date:"+date);
    }
    Creditexception cr()
    {
        try
        {
            return (Creditexception) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            l.info("cloned");
            return this;
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Logger l=Logger.getLogger("tyler");
        l.info("enter the card num:");
        Integer a=s.nextInt();
        Creditexception r=new Creditexception(a);
        Creditexception m= r.cr();
        m.eq();
        if(m.eq())
        {
            l.info("credit card num is same");
        }
        else {
            l.info("credit card num is not same");
        }
        m.show();

    }
}
