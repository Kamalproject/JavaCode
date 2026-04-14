import java.util.Scanner;
class Complex{
    int real;
    int imaginary;
    Complex(){
        real=1;
        imaginary=1;
    }
    Complex(int x,int y){
        real=x;
        imaginary=y;
    }
    Complex(Complex c){
        real=c.real;
        imaginary=c.imaginary;
    }
    void ShowComplex(){
        System.out.println("Complex number is "+real+"+"+imaginary+"i");
    }
    Complex add(Complex c1){
        Complex add=new Complex();
        add.real=real+c1.real;
        add.imaginary=imaginary+c1.imaginary;
        System.out.println("Adition is "+add.real+"+"+add.imaginary);
        return add;
    }
    
   
    Complex sub(Complex c1){
        Complex sub=new Complex();
        sub.real=real-c1.real;
        sub.imaginary=imaginary-c1.imaginary;
        System.out.println("Subtraction is "+ sub.real+"- "+sub.imaginary);
        return sub;
    }
    Complex mul(Complex c1){
        Complex mul=new Complex();
        mul.real=real*c1.real;
        mul.imaginary=imaginary*mul.imaginary;
        System.out.println("multiplication is "+ mul.real+"* "+mul.imaginary );
        return mul;
    }
    
}
public class ComplexNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Complex c=new Complex();
        c.ShowComplex();
        System.out.print("Enter real number ");
        int real=sc.nextInt();
        System.out.print("Enter imaginary: ");
        int imagi=sc.nextInt();
        
        Complex cx=new Complex(real,imagi);
        cx.ShowComplex();
        cx.add(cx);
        cx.sub(cx);
        cx.mul(cx);
        
        
    }
}
