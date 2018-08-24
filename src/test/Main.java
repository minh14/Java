package test;

public class Main {

    public static void main(String[] args) {

        Geometry []geometries = new Geometry[6];
        geometries[0] = new Circle("Circle 1",5);
        geometries[1] = new Rectangle("Rectangle 1", 4, 6);
        geometries[2] = new Square("Square 1", 6);
        geometries[3] = new Rectangle("Rectangle 2", 9, 12);
        geometries[4] = new Circle("Circle 2",9);
        geometries[5] = new Square("Square 2", 9);

        for(Geometry geometry : geometries){
            System.out.println(geometry.getName());
            System.out.println("Acreage: " +geometry.acreage());
            System.out.println("Perimeter: " +geometry.perimeter());
            System.out.println("====================================");

        }

    }
}
