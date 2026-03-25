import java.util.Scanner;
class Ass9{
   int num,dnum;
   Ass9(){
       num=1;
       dnum=1;
   }
   Ass9(int x){
       num=dnum=x;
   }
   Ass9(int x,int y){
       num=x;
       dnum=y;
   }
   Ass9(Ass9 o){
       num=o.num;
       dnum=o.dnum;
   }
   void Display(){
       System.out.println("Fraction number is "+num+ "/"+ dnum);
   }
   Ass9 sum(Ass9 o1){
       Ass9 sum=new Ass9();
       sum.num=num*o1.dnum + o1.num*dnum;
       sum.dnum=dnum*o1.dnum;
       System.out.println("Sum of two number of "+ num+ "/" +dnum+" and "+o1.num+"/"+o1.dnum+ " is "+sum.num+"/"+sum.dnum);
       return sum;
    }
      Ass9 sub(Ass9 o1){
       Ass9 sub=new Ass9();
       sub.num=num*o1.dnum - o1.num*dnum;
       sub.dnum=dnum*o1.dnum;
       System.out.println("Subtraction of two number of "+num+"/"+dnum+" and "+o1.num+"/"+o1.dnum+" is "+sub.num+"/"+sub.dnum);
       return sub;
   }
}

public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Ass9 obj1=new Ass9();
        obj1.Display();
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        Ass9 obj2=new Ass9(n);
        obj2.Display();
        System.out.println("Enter another number ");
        int m=sc.nextInt();
        Ass9 obj3=new Ass9(n,m);
        obj3.Display();
        Ass9 obj4=new Ass9(obj3);
        obj4.Display();
        
        Ass9 s;
        s=obj4.sum(obj2);
        s=obj4.sub(obj2);
        
        
    }
}
