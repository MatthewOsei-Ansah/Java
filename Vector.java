public class Vector implements IVector
{
    double X;
    double Y;
    public Vector(double x, double y)
    {
        this.X = x;
        this.Y = y;
    }

    public Vector add(IVector a, IVector b){
        return new Vector(a.getx() + b.getx(),a.gety() + b.gety());
    }

    public Vector multiply(double scalar, IVector a){
        return new Vector(scalar * a.getx(),scalar * a.gety());
    }

    public int dotProduct(IVector a, IVector b){
        return (int) ((a.getx() * b.getx()) + (a.gety() * b.gety()));
    }
    
    public Vector convexCombination(double scalara, IVector a, double scalarb, IVector b){
        return new Vector((a.getx() * scalara) + (b.getx() * scalarb),(a.gety() * scalara) + (b.gety() * scalarb));
    }

    public double getx() {
        return X;
    }
    

    public double gety() {
        return Y;
    }    
    
    @Override
    public String toString()
    {
        return Double.toString(getx()) + ":" + Double.toString(gety());
    }
}
