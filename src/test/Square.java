package test;

public class Square extends Geometry {

    private double a;

    public double getA(){
        return a;
    }

    public void setA(double a){
        this.a = a;
    }

    public Square(String name) {
        super(name);
    }

    public Square(double a) {
        this.a = a;
    }

    public Square (String name, double a){
        super(name);
        this.a = a;
    }

    public Square(){

    }

    public void display(){
        super.display();
        System.out.println("A: " +this.a);
    }

    @Override
    public double acreage(){
        return this.a * this.a;
    }

    @Override
    public double perimeter(){
        return this.a * 4;
    }
}


