import java.util.Scanner;
public class Factsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=sc.nextInt();
        double sum=1.0;
        int fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
            sum=sum+(1/fact);
        }
        System.out.println("Sum is "+ sum);
    }
}
