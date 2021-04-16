package com.axan.shape;
import java.util.Scanner;

public class Custom{
    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	double l=0.0, b=0.0, h=0.0;
	System.out.print("Enter Length: ");
	try{l = sc.nextDouble();}catch(Exception e){System.out.println("This is not 			allowed"); System.exit(0);}
	if(l<=0){
	    System.out.println("Radius must be greater than 0.");
	    System.out.print("Re-enter Radius: ");
	    try{l = sc.nextDouble();}catch(Exception e){System.out.println("This is not 		allowed"); System.exit(0);}
	}
	System.out.print("Enter Breadth: ");
	try{b = sc.nextDouble();}catch(Exception e){System.out.println("This is not 			allowed"); System.exit(0);}
	if(b<=0){
	    System.out.println("Radius must be greater than 0.");
	    System.out.print("Re-enter Radius: ");
	    try{b = sc.nextDouble();}catch(Exception e){System.out.println("This is not 		allowed"); System.exit(0);}
	}
	System.out.print("Enter Height: ");
	try{h = sc.nextDouble();}catch(Exception e){System.out.println("This is not 			allowed"); System.exit(0);}
	if(h<=0){
	    System.out.println("Radius must be greater than 0.");
	    System.out.print("Re-enter Radius: ");
	    try{h = sc.nextDouble();}catch(Exception e){System.out.println("This is not 		allowed"); System.exit(0);}
	}
	Cuboid cub = new Cuboid();
	cub.setLength(l);
	cub.setBreadth(b);
	cub.setHeight(h);
	System.out.println("Volume of Cuboid: " + cub.calculateVolume());
	System.out.println("Surface Area of Cuboid: " + cub.calculateSurfaceArea());
    }
}

class Rectangle{
    protected double length;
    protected double breadth;

    public double getLength(){
	return this.length;
    }
    public void setLength(double length){
	this.length = length;
    }
    public double getBreadth(){
	return this.breadth;
    }
    public void setBreadth(double breadth){
	this.breadth = breadth;
    }
    public double area(){
	return this.length*this.breadth;
    }
}

class Cuboid extends Rectangle{
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
	return 2*(super.length*super.breadth + super.breadth*height + 	height*super.length);
    }
}