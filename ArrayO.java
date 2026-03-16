import arrayop.ArrayOperation;
import arrayop.Stringoperation;
import java.util.Scanner;
public class ArrayO{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ArrayOperation obj=new ArrayOperation();
		obj.insert(5);
		obj.insert(1);
		obj.insert(2);
		obj.display();
		obj.insertpos(2,10);
		obj.display();
		obj.delete(1);
		obj.display();
		
		System.out.print("\nEnter a String ");
		String str=sc.nextLine();
		Stringoperation st=new Stringoperation();
		st.reverse(str);
		st.length();
		st.Display();
		
	}
}