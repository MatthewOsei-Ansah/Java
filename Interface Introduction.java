import java.util.Scanner;

public class Daddy {
    public static void main(String[] args) {
        int userinput;

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the corrosponding number for the shape you would like to create \n 1)Circle \n 2)Rectangle \n 3)Triangle \n 4)Cylinder \n 5)Sphere \n 6) Cuboid \n 7)Tetrahedron ");
        userinput = sc.nextInt();

        switch (userinput){
            case 1:
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter a radius");
                try {
                    Circle circle = new Circle(sc1.nextInt());
                }
                catch(IllegalArgumentException){
                    System.out.println("The Circle failed to be created");;
                }

                System.out.println("Circle created");
        }

    }
}


// Split

public interface I2DShape {
    double Area();
}


//Split

public interface IPolygon {
    int Sides();
}


// Split

public interface I3DShape extends I2DShape {
    int getHeight();
    double Volume();
}


// Split


public class Rectangle implements I2DShape, IPolygon {
    private int length;
    private int width;
    private final int sides = 4;

    public Rectangle(int Length, int Width){
        this.length = Length;
        this.width = Width;
    }

    @Override
    public double Area(){
        return  length*width;
    }

    @Override
    public int Sides(){
        return sides;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

}


// Split

public class Triangle implements I2DShape, IPolygon{
    private int base;
    private int height;
    // private int theta = base / height;
    private final int sides = 3;

    public Triangle(int Base, int Height){
        this.base = Base;
        this.height = Height;
    }

    @Override
    public double Area(){
        return 0.5*base*height;
    }

    @Override
    public int Sides(){
        return sides;
    }

    public int getBase(){
        return base;
    }

    public int getHeight(){
        return height;
    }

}

//Split


import java.math.*;

public class Circle implements I2DShape{
    private int radius;

    public Circle(int Radius){
        this.radius = Radius;
    }

    @Override
    public double Area(){
        return Math.PI*radius*radius;
    }

    public int getRadius(){
        return radius;
    }
}


// Split

public class Tetrahedron extends Triangle implements I3DShape{
    public Tetrahedron(int Base,  int Height){
        super(Base, Height);
    }

    @Override
    public double Area(){
        System.out.println("The value returned assumes the tetrahedron is REGULAR I can't be asked to code for other use cases");
        System.out.println("The Surface Area of + " + this + ": ");
        return 4*(0.5*getBase()*getHeight());
    }
    @Override
    public double Volume(){
        System.out.println("I think this equation assumes the tetrahedron is only comprised of EQUILATERAL TRIANGLES");
        System.out.println("The Volume of " + this + ":");
        return (getBase() * getBase() * getBase()) / (6 * Math.sqrt(12));
    }
}

// Split

public class Sphere extends Circle implements I3DShape{
    private int height;

    public Sphere(int Height , int Radius){
        super(Radius);
        this.height = Height;
    }

    @Override
    public double Area(){
        System.out.println("The Surface Area of " + this + ": ");
        return (4*Math.PI*getRadius()*getRadius());
    }

    @Override
    public double Volume(){
        System.out.println("The Volume of " + this + ": " );
        return (4/3) * Math.PI * Math.pow(getRadius(), 3);
    }

    @Override
    public int getHeight(){
        return height;
    }
}

// Split
public class Cuboid extends Rectangle implements I3DShape{
    private int height;

    public Cuboid(int length, int width, int Height){
        super(length, width);
        this.height = Height;
    }

    @Override
    public double Area(){
        System.out.println("The Surface Area of " + this + ": ");
        return (2*getLength()*getWidth()) + (2*getLength()* height) + (2*getWidth() * height);
    }

    @Override
    public double Volume(){
        return getLength()*getWidth()*height;
    }

    @Override
    public int getHeight(){
        return height;
    }
}

// Split

import java.math.*;

public class Cylinder extends  Circle implements I3DShape{
    private int height;

    public Cylinder(int Height, int radius){
        super(radius);
        this.height = Height;
    }

    @Override
    public double Area(){
        System.out.println("Surface Area of " + this + ": ");
        return (2*Math.PI*getRadius()*height) + (2*Math.PI*getRadius()*getRadius());
    }

    @Override
    public double Volume(){
        System.out.println("Volume of " + this + ": ");
        return (Math.PI * getRadius() * getRadius()) * (height);
    }

    @Override
    public int getHeight(){
        System.out.println("Height of " + this + ": ");
        return height;
    }
}
