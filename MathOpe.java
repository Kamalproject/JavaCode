import mathop.MathsOperations;
import statop.StatsOperations;
import java.util.Scanner;
public class MathOpe{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Array size ");
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter the Element for index "+ i+" ");
			array[i]=sc.nextInt();
		}
		int max=MathsOperations.max(array);
		int min=MathsOperations.min(array);
		float aver=StatsOperations.average(array);
		float median=StatsOperations.median(array);
		
		System.out.println("Maximum is "+ max);
		System.out.println("Minimum is "+ min);
		System.out.println("Average is "+ aver);
		System.out.println("Median is "+ median);
	}
}