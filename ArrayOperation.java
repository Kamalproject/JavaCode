package arrayop;

public class ArrayOperation{
	int n=0;
	int array[]=new int[5];
	
	public void insert(int element){
		array[n]=element;
		n++;
	}
	public void insertpos(int pos, int element){
		for(int i=n;i>pos;i--){
			array[i]=array[i-1];
		}
		array[pos]=element;
		n++;
	}
	public void delete(int pos){
		for(int i=pos;i<n-1;i++){
			array[i]=array[i+1];
		}
		n--;
	}
	
	public void display(){
		for(int i=0;i<n;i++){
			System.out.print(array[i]+",");
		}
	}
}