import java.util.Scanner;
public class Sumseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter X: ");
        int x=sc.nextInt();
        System.out.print("Enter N: ");
        int n=sc.nextInt();
        double sum=0.0;
        for(int i=1;i<=n;i++){
            
            sum+=sum+1+(Math.pow(x,n));
        }
        System.out.println("Sum is "+ sum);
    }
}
