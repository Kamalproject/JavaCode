import java.util.Scanner;
public class Divseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int num=sc.nextInt();
        
        double sum=0.0;
        for(int i=1;i<=num;i++){
            
            sum+=sum+(1/i);
            System.out.print("1/"+i+" + "+" ");
        }
        System.out.println("= "+sum);
    }
}
