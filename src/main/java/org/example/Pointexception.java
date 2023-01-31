package org.example;

import java.util.Scanner;
import java.util.logging.*;
public class Pointexception implements cloneable
{
    Logger l=Logger.getLogger("tyler");
    Integer x;
    Integer y;

    Pointexception(Integer a, Integer b)
    {
        this.x=a;
        this.y=b;
    }
    boolean eq()
    {
        return x.equals(y);

    }

    Pointexception pt()
    {
        try
        {
            return (Pointexception) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            l.info("clone error");
            return this;
        }
    }

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Logger l=Logger.getLogger("tyler");
        l.info("Enter x corodinate:");
        Integer p=s.nextInt();
        l.info("Enter y corodinate:");
        Integer q=s.nextInt();
        Pointexception r =new Pointexception(p,q);
        Pointexception m=r.pt();
        if(m.eq())
        {
            l.info("x and y are same");
        }
        else {
            l.info("x and y are not same");
        }


    }

}
