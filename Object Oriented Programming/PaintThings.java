/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectorientedprogramming;


/**
 *
 * @author Charvi
 */
import java.lang.*;
import java.io.*;
import java.util.*;
abstract class Shape{
    String shapeName;
    abstract double area();
    abstract String tostring();
}

class Sphere extends Shape{
    double S_radius;
    public Sphere(double r)
      {
          super.shapeName="Sphere";
          S_radius = r;
      }
    public double area(){
        return 4*Math.PI*S_radius*S_radius;
    }
    public String tostring()
    {
        return super.shapeName + " of radius " + S_radius;
    }
}
class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(double l, double w) 
    {
        super.shapeName="Rectangle";
        length = l;
        width = w;
    }
    public double area(){
        return length*width;
    }
    public String tostring(){
        return super.shapeName+" of length "+length + " and width "+ width;
    }
}
class Cylinder extends Shape{
    double C_radius;
    double height;
    public Cylinder(double r, double h){
        C_radius=r;
        height=h;
        super.shapeName="Cylinder";
    }
    public double area(){
        return Math.PI*(C_radius*C_radius)*height;
    }
    public String tostring(){
        return super.shapeName+" of radius "+C_radius+" and height "+height;
    }
}
class Paint{
    static double coverage=0;
    public Paint(double c)
    {
        coverage = c;
    }
    public static double amount(Shape s){
        System.out.println("The amount calculations for: "+s.tostring());
        double result=s.area();
        return result/coverage;
    }
}

public class PaintThings {

    public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the coverage:  ");
	    double coverage = sc.nextDouble();
	    Paint paint = new Paint(coverage);
	    
	    Rectangle deck=new Rectangle(20,35);
	    Sphere bigBall=new Sphere(15);
	    Cylinder tank=new Cylinder(10,30);
	    	    
	    System.out.println(Paint.amount(deck));
	    System.out.println(Paint.amount(bigBall));
	    System.out.println(Paint.amount(tank));
	    
      
}
    
}
