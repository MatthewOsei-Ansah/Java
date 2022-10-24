import java.util.*;
import java.util.regex.*;

public class EntryPoint {
    static boolean Again(){
        String playagain;
        boolean valid;
        char ans;
        boolean again;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Would you like to create another shape? Y/N: ");
        playagain = keyboard.nextLine();
        playagain = playagain.toUpperCase();
        valid = Pattern.matches("[YN]+", playagain);

        while(!valid) {
            System.out.println("Please enter Y or N");
            System.out.println("Would you like to create another shape Y/N: ");
            playagain = keyboard.nextLine();
            playagain = playagain.toUpperCase();
            valid = Pattern.matches("[YN]+", playagain);
        }
        char[] playagainarray = playagain.toCharArray();
        ans = playagainarray[0];

        again = ans == 'Y';

        return again;
    }

    static void OutputAll(ArrayList<I2DShape> Shapes){
        for(I2DShape shape : Shapes) {
            System.out.println("----------------------------------------------------------------------------------------");
            if (shape instanceof Circle) {
                if (shape instanceof Sphere) {
                    System.out.println("Radius of "+ shape + ": " + ((Sphere) shape).getRadius());
                    System.out.println("Surface Area of "+ shape + ": " + ((Sphere) shape).SurfaceArea());
                    System.out.println("Volume of " + shape + ": " +  ((Sphere) shape).Volume());
                } else if (shape instanceof Cylinder) {
                    System.out.println("Radius of " + shape + ": " + ((Cylinder)((Circle)shape)).getRadius());
                    System.out.println("Height of " + shape + ": " + ((Cylinder)((Circle)shape)).getHeight());
                    System.out.println("Surface Area of "+ shape + ": " + ((Cylinder)((Circle)shape)).SurfaceArea());
                    System.out.println("Volume of " + shape + ": " + ((Cylinder)((Circle)shape)).Volume());
                } else {
                    System.out.println("Radius of " + shape + ": " + ((Circle) shape).getRadius());
                    System.out.println("Area of " + shape + shape.Area());
                }

            } else if (shape instanceof Rectangle) {
                if(shape instanceof Cuboid) {
                    System.out.println("Length of" + shape + ": " + ((Cuboid) shape).getLength());
                    System.out.println("Width of " + shape + ": " + ((Cuboid) shape).getWidth());
                    System.out.println("Height of " + shape + ": " + ((Cuboid) shape).getHeight());
                    System.out.println("Surface area of " + shape + ": " + ((Cuboid) shape).SurfaceArea());
                    System.out.println("Volume of " + shape + ": " + ((Cuboid) shape).Volume());
                }else {
                    System.out.println("Area of " + shape + ": " + shape.Area());
                    System.out.println("Length of " + shape + ": " + ((Rectangle) shape).getLength());
                    System.out.println("Width of " + shape + ((Rectangle) shape).getWidth());
                    System.out.println("Number of sides: " + ((Rectangle) shape).Sides());
                }
            } else if (shape instanceof Triangle) {
                if(shape instanceof Tetrahedron) {
                    System.out.println("Base of " + shape + ": " + ((Tetrahedron) shape).getBase());
                    System.out.println("Height of " + shape + ": " + ((Tetrahedron) shape).getHeight());
                    System.out.println("Surface area of " + shape + ": " + ((Tetrahedron) shape).SurfaceArea());
                    System.out.println("Volume of " + shape + ": " + ((Tetrahedron) shape).Volume());
                } else {
                    System.out.println("Base of " + shape + ": " + ((Triangle) shape).getBase());
                    System.out.println("Height of " + shape + ": " + ((Triangle) shape).getHeight());
                    System.out.println("Area of " + shape + ": " + shape.Area());
                    System.out.println("Number of " + shape + ": " + ((Triangle) shape).Sides());
                }
            } else if (shape instanceof Parallelogram) {
                System.out.println("Base of " + shape + ((Parallelogram) shape).getBase());
                System.out.println("Height of " + shape + ((Parallelogram) shape).getHeight());
                System.out.println("Area of " + shape + shape.Area());
                System.out.println("Number of Sides: " + ((Parallelogram) shape).Sides());
            }

            }
        }


    public static void main(String[] args) {
        int userinput;
        int length;
        int width;
        int height;
        int base;
        int Height;
        int radius;
        boolean again;
        ArrayList<I2DShape> Shapes = new ArrayList<>();
        ArrayList<I3DShape> Shapes3D = new ArrayList<>();
        int index = 0;
        ArrayList<Double> Areas = new ArrayList<>();
        ArrayList<Double> SurfaceAreas = new ArrayList<>();
        Scanner keyboard1 = new Scanner(System.in);

        do {
            System.out.println("Enter the corresponding number for the shape you would like to create \n 1)Circle \n 2)Rectangle \n 3)Triangle \n 4)Parallelogram \n 5)Cylinder \n 6)Sphere \n 7)Cuboid \n 8)Tetrahedron ");
            userinput = keyboard1.nextInt();

            switch (userinput) {
                case 1:
                    try {
                        System.out.println("Enter a radius");
                        radius = keyboard1.nextInt();
                        Circle circle = new Circle(radius);
                        Shapes.add(circle);
                    }catch (Exception e){
                        System.out.println("An error has occurred");
                        System.out.println("Terminating program");
                        System.exit(0);
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Enter length");
                        length = keyboard1.nextInt();
                        System.out.println("Enter Width");
                        width = keyboard1.nextInt();
                        Rectangle rectangle = new Rectangle(length, width);
                        Shapes.add(rectangle);
                    }catch (Exception e){
                        System.out.println("An error has occurred");
                        System.out.println("Terminating program");
                        System.exit(0);
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Enter base");
                        base = keyboard1.nextInt();
                        System.out.println("Enter height");
                        height = keyboard1.nextInt();
                        Triangle triangle = new Triangle(base, height);
                        Shapes.add(triangle);
                    }catch (Exception e){
                        System.out.println("An error has occurred");
                        System.out.println("Terminating program");
                        System.exit(0);
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Enter base");
                        base = keyboard1.nextInt();
                        System.out.println("Enter height");
                        height = keyboard1.nextInt();
                        Parallelogram parallelogram = new Parallelogram(height, base);
                        Shapes.add(parallelogram);
                    }catch (Exception e){
                        System.out.println("An error has occurred");
                        System.out.println("Terminating program");
                        System.exit(0);
                    }
                    break;
                case 5:
                    try {
                        System.out.println("Enter radius");
                        radius = keyboard1.nextInt();
                        System.out.println("Enter height");
                        Height = keyboard1.nextInt();
                        Cylinder cylinder = new Cylinder(Height, radius);
                        Shapes.add(cylinder);
                    }catch (Exception e){
                        System.out.println("An error has occurred");
                        System.out.println("Terminating program");
                        System.exit(0);
                    }
                    break;
                case 6:
                    try {
                        System.out.println("Enter radius");
                        radius = keyboard1.nextInt();
                        Sphere sphere = new Sphere(radius);
                        Shapes.add(sphere);
                    }catch (Exception e){
                        System.out.println("An error has occurred");
                        System.out.println("Terminating program");
                        System.exit(0);
                    }
                    break;
                case 7:
                    try {
                        System.out.println("Enter length");
                        length = keyboard1.nextInt();
                        System.out.println("Enter width");
                        width = keyboard1.nextInt();
                        System.out.println("Enter height");
                        Height = keyboard1.nextInt();
                        Cuboid cuboid = new Cuboid(length, width, Height);
                        Shapes.add(cuboid);
                    }catch (Exception e){
                        System.out.println("An error has occurred");
                        System.out.println("Terminating program");
                        System.exit(0);
                    }
                    break;
                case 8:
                    try {
                        System.out.println("Enter base");
                        base = keyboard1.nextInt();
                        System.out.println("Enter height");
                        Height = keyboard1.nextInt();
                        Tetrahedron tetrahedron = new Tetrahedron(base, Height);
                        tetrahedron.Area();
                        tetrahedron.Volume();
                        Shapes.add(tetrahedron);
                    }catch (Exception e){
                        System.out.println("An error has occurred");
                        System.out.println("Terminating program");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 8");
            }
            again = Again();
        }while (again);

        System.out.println("What properties of shapes would you like to see? \n 1) Area(s) \n 2) Surface Area(s) \n 3) Everything");
        userinput = keyboard1.nextInt();

        switch (userinput){
            case 1:
                for (I2DShape shape : Shapes){
                    Areas.add(Shapes.get(index).Area());
                    index += 1;
                }
                System.out.println("Area(s) of the shape(s) in the order they were created: " + Areas);
                Collections.sort(Areas);
                System.out.println("Area(s) of the shapes in ascending order of magnitude: " + Areas);
                break;
            case 2:
                for(I2DShape shape : Shapes){
                    if(shape instanceof I3DShape){
                        Areas.add(Shapes.get(index).Area());
                        index += 1;
                    }
                }
                System.out.println("Surface area(s) of the shape(s) in the order they were created: " + Areas);
                Collections.sort(Areas);
                System.out.println("Surface area(s) of the shapes in ascending order of magnitude: " + Areas);
                break;
            case 3:
                OutputAll(Shapes);
            }
    }
}

// Split

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

public class Cuboid extends Rectangle implements I3DShape{
    private int height;

    public Cuboid(int length, int width, int Height){
        super(length, width);
        this.height = Height;
    }

    @Override
    public double SurfaceArea(){
        return (2*getLength()*getWidth()) + (2*getLength()* height) + (2*getWidth() * height);
    }

    @Override
    public double Area(){
        return SurfaceArea();
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
    public double SurfaceArea(){
        return (2*Math.PI*getRadius()*height) + (2*Math.PI*getRadius()*getRadius());
    }

    @Override
    public double Area(){
        return SurfaceArea();
    }

    @Override
    public double Volume(){
        return (Math.PI * getRadius() * getRadius()) * (height);
    }

    @Override
    public int getHeight(){
        return height;
    }
}

// Split


public interface I2DShape extends Comparable<I2DShape> {
    default double Area() {
        return 0;
    }

    @Override
    default int compareTo(I2DShape other) {
        return Double.compare(this.Area(), other.Area());
    }
}

// Split

public interface I3DShape extends I2DShape {
    int getHeight();
    double Volume();

    public double SurfaceArea();
}

// Split

public interface IPolygon {
    int Sides();
}

public class Parallelogram  implements I2DShape, IPolygon{
    private int height;
    private int base;

    public Parallelogram(int Height, int Base){
        this.height = Height;
        this.base = Base;
    }

    @Override
    public int Sides(){
        return 4;
    }

    @Override
    public double Area(){
        return(base*height);
    }

    public int getBase(){
        return base;
    }

    public int getHeight(){
        return height;
    }
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

    public int getLength(){;
        return length;
    }

    public int getWidth(){
        return width;
    }

}

// Split

public class Sphere extends Circle implements I3DShape{
    private int height;

    public Sphere(int Radius){
        super(Radius);
    }

    @Override
    public double SurfaceArea(){
        return (4*Math.PI*getRadius()*getRadius());
    }

    @Override
    public double Area(){
        return SurfaceArea();
    }

    @Override
    public double Volume(){
        return (4/3) * Math.PI * Math.pow(getRadius(), 3);
    }

    @Override
    public int getHeight(){
        return getRadius();
    }

    @Override
    public int getRadius() {
        return super.getRadius();
    }
}

// Split

public class Tetrahedron extends Triangle implements I3DShape{
    public Tetrahedron(int Base,  int Height){
        super(Base, Height);
    }

    @Override
    public double SurfaceArea(){
        System.out.println("The value for the surface area assumes the tetrahedron is REGULAR");
        return 4*(0.5*getBase()*getHeight());
    }

    @Override
    public double Area(){
        return SurfaceArea();
    }

    @Override
    public double Volume(){
        System.out.println("I think the equation I used for volume assumes the tetrahedron is only comprised of EQUILATERAL TRIANGLES");
        return (getBase() * getBase() * getBase()) / (6 * Math.sqrt(12));
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
