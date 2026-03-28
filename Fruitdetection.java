import java.util.Scanner;
abstract class Fruit{
    String color,taste;
    Fruit(String c,String t){
        color=c;
        taste=t;
    }
    abstract void Display();
}

class Apple extends Fruit{
    Apple(String color,String taste){
        super(color,taste);
    }
    void Display(){
        System.out.println("Fruit is Apple");
        System.out.println("Colour is "+color);
        System.out.println("Taste is "+taste);
    }
}

class Banana extends Fruit{
    Banana(String color,String taste){
        super(color,taste);
    }
    void Display(){
        System.out.println("Fruit is Banana");
        System.out.println("Color of Banana is "+color);
        System.out.println("Taste is "+taste);
    }
}

class Orange extends Fruit{
    Orange(String color,String taste){
        super(color,taste);
    }
    void Display(){
        System.out.println("Fruit is Orange");
        System.out.println("Color is "+color);
        System.out.println("Taste is "+taste);
    }
}

class Strawberry extends Fruit{
    Strawberry(String color,String taste){
        super(color,taste);
    }
    void Display(){
        System.out.println("Fruit is Strawberry");
        System.out.println("Color of Strawbery is "+color);
        System.out.println("Taste of the Strawbery is "+taste);
    }
}
public class Fruitdetection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("What is the Color of Apple: ");
        String c=sc.nextLine();
        System.out.print("What's its taste: ");
        String t=sc.nextLine();
        Fruit f;
        f=new Apple(c,t);
        f.Display();
        sc.nextLine();
        System.out.print("What is the color of Banana ");
        String co=sc.nextLine();
        System.out.print("What's the taste: ");
        String ta=sc.nextLine();
        f=new Banana(co,ta);
        f.Display();
        sc.nextLine();
        System.out.print("What is the color of Orange is ");
        String cl=sc.nextLine();
        System.out.print("What's the taste of the Orange is ");
        String ts=sc.nextLine();
        f=new Orange(cl,ts);
        f.Display();
        sc.nextLine();
        System.out.print("What is the color of Strawberry ");
        String clo=sc.nextLine();
        System.out.print("What's the taste of the strawberry ");
        String tas=sc.nextLine();
        f=new Strawberry(clo,tas);
        f.Display();
    }
}
