import java.util.Scanner;
abstract class Shape{
    int length;
    int breadth;
    int height;
    Shape(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
    }
    abstract double Volume();
    abstract double SurfaceArea();
}

class Cube extends Shape{
    Cube(int size){
        super(size,size,size);       
    }
    double Volume(){
        return length*length*length;
    }
    double SurfaceArea(){
        return 6*(length*length);
    }
}
class Cylinder extends Shape{
    Cylinder(int r,int h){
        super(r,r,h);
    }
    double Volume(){
        double pi=3.142;
        return pi*length*length*height;
    }
    double SurfaceArea(){
        double pi=3.142;
        return pi*length*(length+breadth);
    }
}

class Cuboid extends Shape{
    Cuboid(int length,int breadth,int height){
        super(length,breadth,height);
    }
    double Volume(){
        return length*breadth*height;
    }
    double SurfaceArea(){
        return 2*((length*breadth)+(breadth*height)+(length*height));
    }
}
public class Shapespecification {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length: ");
        int length=sc.nextInt();
        System.out.print("Enter the Breadth: ");
        int breadth=sc.nextInt();
        System.out.print("Enter the Height: ");
        int height=sc.nextInt();
        
        Cube c=new Cube(length);
        System.out.println("Volume of the Cube is "+c.Volume());
        System.out.println("Surface Area of the Cube is "+c.SurfaceArea());
        sc.nextLine();
        Cylinder cy=new Cylinder(length,height);
        System.out.println("Volume of the Cylinder is "+cy.Volume());
        System.out.println("Surface Area of the Cylinder is "+cy.SurfaceArea());
        sc.nextLine();
        Cuboid cu=new Cuboid(length,breadth,height);
        System.out.println("Volume of the Cubeoid is "+cy.Volume());
        System.out.println("Surface Area of the Cuboid is "+cy.SurfaceArea());
    }
}
