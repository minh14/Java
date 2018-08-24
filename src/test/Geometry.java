package test;

public abstract class Geometry {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Geometry(String name){
        super();
        this.name = name;
    }

    public Geometry(){
        super();
    }

    public void display(){
        System.out.println("Name: " +this.name);
    }

    public abstract double acreage();

    public abstract double perimeter();

}
