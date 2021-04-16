package com.axan.shape;
import java.util.Scanner;

public class Custom2{
    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	double r=0.0, h=0.0;
	System.out.print("Enter Radius: ");
	try{r = sc.nextDouble();}catch(Exception e){System.out.println("This is not allowed"); System.exit(0);}
	if(r<=0){
	    System.out.println("Radius must be greater than 0.");
	    System.out.print("Re-enter Radius: ");
	    try{r = sc.nextDouble();}catch(Exception e){System.out.println("This is notallowed"); System.exit(0);}
	}
	System.out.print("Enter Height: ");
	try{h = sc.nextDouble();}catch(Exception e){System.out.println("This is not allowed"); System.exit(0);}
	if(h<=0){
	    System.out.println("Radius must be greater than 0.");
	    System.out.print("Re-enter Radius: ");
	    try{h = sc.nextDouble();}catch(Exception e){System.out.println("This is not allowed"); System.exit(0);}
	}
	Cylinder c = new Cylinder();
	c.setRadius(r);
	c.setHeight(h);
	System.out.println("Volume of Cylinder: " + c.calculateVolume());
	System.out.println("Surface Area of Cylinder: " + c.calculateSurfaceArea());
    }
}

class Circle{
    protected double radius;

    public double getRadius(){
	return this.radius;
    }
    public void setRadius(double radius){
	this.radius = radius;
    }
    public double area(){
	return Math.PI * Math.pow(this.radius,2);
    }
    public double perimeter(){
	return 2*Math.PI*this.radius;
    }
}

class Cylinder extends Circle{
    private double height;

    public double getHeight(){
	return this.height;
    }
    public void setHeight(double height){
	this.height = height;
    }
    public double calculateVolume(){
	return super.area()*this.height;
    }
    public double calculateSurfaceArea(){
	return super.perimeter()*(super.radius+this.height);
    }
}