import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter element for index: "+i);
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        
        for(int i=0;i<n;i++){
            int count=1;
//            int p_arr[]=new int[count];
            for(int j=1;j<arr[i];j++){
                if(arr[i]%j==0){
                    count++;
                }
            }
            System.out.println();
            if(count==2){
                System.out.println(arr[i]);
            }
        }
    }
}
