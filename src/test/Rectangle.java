package test;

public class Rectangle extends Geometry {

    private double a;
    private double b;

    public double getA(){
        return a;
    }

    public void setA(double a){
        this.a = a;
    }

    public double getB(){
        return b;
    }

    public void setB(double b){
        this.b = b;
    }

    public Rectangle(String name, double a, double b){
        super(name);
        this.a = a;
        this.b = b;
    }

    public Rectangle(){
        super();
    }

    public void display(){
        super.display();
        System.out.println("A: " +this.a);
        System.out.println("B: " +this.b);
    }

    @Override
    public double acreage(){
        return this.a * this.b;
    }

    @Override
    public double perimeter(){
        return (this.a + this.b) * 2;
    }
}
