import java.util.Scanner;
public class OddsqarEvenque {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        double sum=0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                sum+=Math.pow(i,3);
            }
            else{
                sum+=Math.pow(i,2);
            }
        }
        System.out.println("Sum is "+sum);
    }
}
