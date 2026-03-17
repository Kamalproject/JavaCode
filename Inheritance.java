import java.util.Scanner;
class Vehicle{
    private String Brand;
    private String Country_origin;
    private int Base_price;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Which Brand you want: ");
        Brand=sc.nextLine();
        System.out.print("Manufactured in which country: ");
        Country_origin=sc.nextLine();
        System.out.print("What is the Base Price: ");
        Base_price=sc.nextInt();
    }
    public int getBaseprice(){
        return Base_price;
    }
    
    void disply(){
        System.out.println("Brand is "+Brand);
        System.out.println("Manufacture in "+Country_origin);
        System.out.println("Base Price is "+Base_price);
    }
}

class Car extends Vehicle{
    String Model;
    int Speed;
    double Marked_price;
    void read(){
        Scanner sc=new Scanner(System.in);
        super.input();
        System.out.print("Which Model you want: ");
        Model=sc.nextLine();
        System.out.print("What is the Speed: ");
        Speed=sc.nextInt();
        getmarketprice();
    }
    void getmarketprice(){
        int Base=getBaseprice();
        if(Speed>80){
            Marked_price=Base*1.15;
        }
        else{
            Marked_price=Base*.95;
        }
    }
    void show(){
        super.disply();
        System.out.println("Model is "+Model);
        System.out.println("Speed is "+Speed);
        System.out.println("Marked Price is "+ Marked_price);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car c=new Car();
        c.read();
        c.show();
    }
}
