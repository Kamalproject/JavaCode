package statop;

public class StatsOperations{
	public static float average(int array[]){
		int sum=0;
		for(int i=0;i<array.length;i++){
			sum+=array[i];
		}
		float average=(float)sum/array.length;
		return average;
	}
	public static float median(int array[]){
		float median=0;
		int n=array.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(array[j]>array[j+1]){
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		if(n%2==0){
			median=(array[n/2] + array[n/2-1])/2f;
			return median;
		}
		else{
			median=array[n/2];
			return median;
		}
		
	}
}