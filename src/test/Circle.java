package test;

public class Circle extends Geometry {

    private double r;

    public double getR(){
        return r;
    }

    public void setR(double r){
        this.r = r;
    }

    public Circle(String name, double r){
        super(name);
        this.r = r;
    }

    public Circle(){
        super();
    }

    public void display(){
        super.display();
        System.out.println("A: " +this.r);
    }

    @Override
    public double acreage(){
        return Math.PI * Math.pow(this.r, 2);
    }

    @Override
    public double perimeter(){
        return 2 * Math.PI * this.r;
    }
}
