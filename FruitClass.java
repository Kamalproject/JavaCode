import java.util.Scanner;
class Fruit{
    int price_perkg;
    int quantity;
    int fruit_grade;
    int Total_price;
    
    Fruit(){
        price_perkg=120;
        quantity=5;
        fruit_grade=1;
    }
    Fruit(int price,int quant,int grade){
        price_perkg=price;
        quantity=quant;
        fruit_grade=grade;
    }
    
    void TotalPrice(){
        Total_price=price_perkg*quantity;
    }
    void displyDetail(){
        System.out.println("Price of fruit per kg is "+price_perkg);
        System.out.println("Quantity you take: "+quantity);
        System.out.println("Grade is "+fruit_grade);
        System.out.println("Total price is "+Total_price);
    }
}
public class FruitClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Fruit f1=new Fruit();
        f1.TotalPrice();
        f1.displyDetail();
        
        System.out.print("What is the price per kg: ");
        int price=sc.nextInt();
        System.out.print("How much you want: ");
        int quant=sc.nextInt();
        System.out.print("What is the grade of this fruit: ");
        int grade=sc.nextInt();
        
        Fruit f2=new Fruit(price,quant,grade);
        f2.TotalPrice();
        f2.displyDetail();
        
    }
}
