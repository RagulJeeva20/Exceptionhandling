package org.example;


import java.util.Scanner;
import java.util.logging.*;

class Wrongchoice extends  Exception
{
    public Wrongchoice(String s)
    {
        super(s);
    }
}
public class Shapeswithexception {
    float shape;
    double radius;
    float length;
    float breadth;
    float base;
    float height;
    float width;
    float side1;
    float side2;
    float peri;
    float area;
    double cirperi;
    double cirarea;
    Scanner s=new Scanner(System.in);
    Logger l=Logger.getLogger("tyler");

    Shapeswithexception()
    {
        l.info("select the shape by Entering the number: \n 1.circle \n 2.triangle \n 3.rectangle" );
        float a =s.nextFloat();
        shape=a;
        try {
            if (shape == 1) {
                l.info("enter the radius:");
                double r = s.nextInt();
                radius = r;
                l.info("shape Circle Has Been created");
            }
            else if(shape == 2) {
                l.info("enter the base:");
                float b = s.nextFloat();
                base = b;
                l.info("enter the side1:");
                float c = s.nextFloat();
                side1 = c;
                l.info("enter the side1:");
                float d = s.nextFloat();
                side2 = d;
                l.info("enter the height:");
                float h = s.nextFloat();
                height = h;
                l.info("shape Triangle Has Been created");

            }
            else if (shape == 3) {
                l.info("enter the length:");
                int f = s.nextInt();
                length = f;
                l.info("enter the width:");
                int g = s.nextInt();
                width = g;
                l.info("Enter the Breadth:");
                breadth=s.nextInt();
                l.info("shape Rectangle Has Been created");
            }
            else {
                throw new Wrongchoice(" you have entered wrong choice");
            }

        }
        catch (Wrongchoice e)
        {
            l.log(Level.INFO,() -> e.getMessage());
            System.exit(0);
        }
    }
    void perimeter()
    {
        if (shape==1)
        {

            cirperi =2*3.14*radius;
            l.log(Level.INFO,() ->"the perimeter of circle is:" + cirperi);
        }
        if (shape==2)
        {

            peri =base+side1+side2;
            l.log(Level.INFO, () ->"the perimeter of triangle is:" + peri);
        }
        if (shape==3)
        {

            peri =2 * (length+width);
            l.log(Level.INFO, () ->"the perimeter of rectangle is:" + peri);
        }
    }
    void areas()
    {
        if (shape==1)
        {
            cirarea =3.14*radius*radius;
            l.log(Level.INFO, () ->"The area of circle is :" + cirarea);
        }
        if (shape==2)
        {
            area =(base*height)/2;
            l.log(Level.INFO, () ->"The area of Triangle is : " + area);

        }
        if (shape==3)
        {
            area =length*breadth;
            l.log(Level.INFO, () ->"The area of Rectangler is : " + area);

        }
    }

    public static void main(String[] args) {
        Shapeswithexception a1=new Shapeswithexception();
        a1.perimeter();
        a1.areas();
    }

}
