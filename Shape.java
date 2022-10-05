// SPLIT UP THIS CODE WHEN YOU COPY IT INTO DIFFERENT WINDOWS
package shapes;


import java.util.ArrayList;


public abstract class Shape {    
    public Shape()
    {
        System.out.println("Shape: " + this.toString());
    }
    
    public abstract double Area();         

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Shape> shapes = new ArrayList<Shape>();
                           
        // Instantiate an object of each class and add to the shapes array list
        Rectangle rectangle = new Rectangle(1,2);
        shapes.add(rectangle);

        Circle circle = new Circle(5);
        shapes.add(circle);

        Cylinder cylinder = new Cylinder(12, 5);
        shapes.add(cylinder);

        Cuboid cuboid = new Cuboid(15, 10, 12);
        shapes.add(cuboid);
        
        // Iterate over each shape in the array list
        for (Shape shape : shapes )    
        {// Print out the shape attributes
            System.out.println("-------------------------------------------");        
            System.out.println(shape.toString() + " : " + shape.Area());  
            System.out.println("Area : " + shape.Area());
            
            if (shape instanceof Polygon)
            {//Printout the Polygon attributes
                System.out.println("Sides : " + ((Polygon)shape).Sides());  
            
                if (shape instanceof Rectangle)
                {// Print out the Rectangle attributes
                    System.out.println("Length : " + ((Rectangle)shape).Length());  
                    System.out.println("Width : " + ((Rectangle)shape).Width());

                    if(shape instanceof Cuboid){
                        System.out.println("Volume: " + ((Cuboid)shape).Volume());
                }
                }
            }
            if (shape instanceof Circle){
                System.out.println("Radius: " + ((Circle)shape).getRadius());
                System.out.println("Area: "+ ((Circle)shape).Area());
                if(shape instanceof Cylinder){
                    System.out.println("Volume: "+ ((Cylinder)shape).Volume());
                }
            }
        }
    }
}


package shapes;


public abstract class Polygon extends Shape {
    public Polygon()
    {   
        System.out.println("Polygon: " + this.toString());        
    }
    
    @Override
    public abstract double Area();
                
    public abstract int Sides();
}

package shapes;

public class Circle extends Shape{

    private int radius;

    public Circle(){
        System.out.println("Circle: " + this);
    }

    public Circle(int radius){
       this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    @Override
    public double Area(){
        return Math.PI * radius * radius;
    }
}

package shapes;

public class Cylinder extends Circle{
    private int height;

    public Cylinder(){
        System.out.println("Cylinder: " + this);
    }

    public Cylinder(int height, int radius){
        super(radius);
        this.height = height;

    }


    @Override
    public double Area(){
        return (2*Math.PI*getRadius()*height) + (2*Math.PI*getRadius()*getRadius());
    }

    public double Volume(){
        return (Math.PI*getRadius()*getRadius()) * height;
    }



}

package shapes;


public class Rectangle extends Polygon {
    private int length = 0;
    private int width = 0;
            
    public Rectangle()
    {   
        System.out.println("Rectangle: " + this.toString());          
    }
    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public int Sides()
    {
        return 4;              
    }
    
    @Override
    public double Area()
    {
        return length * width;        
    }
    
    public int Length()
    {
        return length;        
    }
    
    public int Width()
    {
        return width;        
    }
}

package shapes;

public class Cuboid extends Rectangle {
    private int height;

    public Cuboid(){
        System.out.println("Cuboid: " + this);
    }

    public Cuboid(int length, int width, int height){
        super(length, width);
        this.height = height;
    }

    public double Volume(){
        return height * Length() * Width();
    }

    @Override
    public int Sides()
    {
        return 12;
    }


}
