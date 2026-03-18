import java.util.Scanner;
public class Assignment10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr array size: ");
        int n=sc.nextInt();
        int array[]=new int[n];
        int sum=0;
        double average=0.0;
        System.out.println("--------Array Inserting--------");
        for(int i=0;i<n;i++){
            System.out.println("Enter the element for index "+i);
            array[i]=sc.nextInt();
        }
        System.out.println("--------Array Display----------");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");            
            sum+=array[i];           
            average=(double)sum/(double)n;
        }
        System.out.println("\nSum of the elements is "+sum+"\nAverage is "+average);
        
        System.out.println("-------Swapping Min and Max number--------");
        int min=array[0];
        int max=array[0];
        int minindex=0;
        int maxindex=0;
        for(int i=0;i<n;i++){
            if(array[i]<min){
                min=array[i];
                minindex=i;
            }
            if(array[i]>max){
                max=array[i];
                maxindex=i;
            }          
        }
        int temp=array[minindex];
        array[minindex]=array[maxindex];
        array[maxindex]=temp;  
        System.out.println("After Swaping Min and Max");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        
        
        System.out.println("\n--------Find the occurrence of all unique elements---------");
        for(int i=0;i<n;i++){
            int count=1;
            boolean visited=false;
            for(int j=0;j<i;j++){
                if(array[i]==array[j]){
                    visited=true;
                    break;
                }
            }
            if(visited)
                continue;
                for(int k=i+1;k<n;k++){
                    if(array[i]==array[k]){
                        count++;
                    }
                }
            System.out.println(array[i]+" occurs "+ count+" times");
        }
        
    }
}
