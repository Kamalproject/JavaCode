import java.util.Scanner;
class Fraction{
    int num;
    int dnum;
    Fraction(){
        num=1;
        dnum=1;
    }
    Fraction(int x){
    num=dnum=x;
    
    
    }
    Fraction (int num,int dnum){
        this.num=num;
        this.dnum=dnum;
    }
    Fraction(Fraction f){
        num=f.num;
        dnum=f.dnum;
    }
    void Show(){
        System.out.println("Numeritor is "+num);
        System.out.println("Denomierator is "+dnum);
        System.out.println("Final Result is "+num+"/"+dnum);
    }
    Fraction Add(Fraction f1){
        Fraction sum=new Fraction();
        sum.num=num*f1.dnum+dnum*f1.num;
        sum.dnum=dnum*f1.dnum;
        System.out.println("Sum of two number of"+num+"/"+dnum+" + "+f1.num+"/"+f1.dnum+" = :"+sum.num+"/"+sum.dnum);
        return sum;
    }
    Fraction Mul(Fraction f1){
        Fraction mul=new Fraction();
        mul.num=num*f1.num;
        mul.dnum=dnum*f1.dnum;
        System.out.println("Multiplication of "+num+"/"+dnum+" * "+f1.num+"/"+f1.dnum+" = "+mul.num+"/"+mul.dnum);
        return mul;
    }
    Fraction Sub(Fraction f1){
        Fraction sub=new Fraction();
        sub.num=num*f1.dnum-dnum*f1.num;
        sub.dnum=dnum*f1.dnum;
        System.out.println("Subtraction of "+num+"/"+dnum+" -"+f1.num+"/"+f1.dnum+" = "+sub.num+"/"+sub.dnum);
        return sub;
    }
}
public class FractionWork {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Fraction f1=new Fraction();
        f1.Show();
        System.out.print("Enter Neumerator: ");
        int num=sc.nextInt();
        System.out.print("Enter Denominator: ");
        int dnum=sc.nextInt();
        Fraction f2=new Fraction(num,dnum);
        f2.Show();
        Fraction f3=new Fraction(num);
        f3.Show();
        Fraction f4=new Fraction(f2);
        f4.Show();
        
        Fraction fs;
        fs=f2.Add(f4);
        fs=f2.Sub(f4);
        fs=f2.Mul(f4);
    }
}
