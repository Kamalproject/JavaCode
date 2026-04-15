class Adder{
    public int sum(int a,int b){
        int sum=a+b;
        System.out.println(sum);
        return sum;
    }
    public double sum(double a,double b,double c){
        double sum=a+b+c;
        System.out.println(sum);
        return sum;
    }
}
public class Overload {
    public static void main(String[] args) {
        Adder add=new Adder();
        add.sum(5,6);
        add.sum(5.6,7.8,6.0);
    }
}
