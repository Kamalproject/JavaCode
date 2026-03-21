import java.util.Scanner;
class Number{
    int n;
    int arr[];
    Number(int number){
        n=number;
        arr=new int[n];
    }
    void inputElement(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("Enter the Element for index "+i+" ");
            arr[i]=sc.nextInt();
        }
    }
    void displayArray(){
        System.out.print("Original arry is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

class OddNum extends Number{
    int count;
    int odd_arr[];
    OddNum(int n){
        super(n);
    }
    void countOdd(){
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                count++;
            }
        }
        odd_arr=new int[count];
    }
    
    void CopyOdd(){
        int temp=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                odd_arr[temp]=arr[i];
                temp++;
            }
        }
    }
    void DisplayOdd(){
        System.out.print("Odd numbers are: ");
        for(int i=0;i<count;i++){
            System.out.print(odd_arr[i]+"");
        }
        System.out.println();
    }
}

class PrimeNum extends OddNum{
    
    PrimeNum(int n){
        super(n);
    }   
        
    void ShowPrime(){
        System.out.println("Prime Elements are");
        for(int i=0;i<count;i++){
            int count_p=0;            
            for(int j=1;j<odd_arr[i];j++){
                if(arr[i]%j==0){
                    count_p++;
                }
            }
            
            if(count_p==2){
                System.out.println(odd_arr[i]);
            }
        }
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n=sc.nextInt();
        PrimeNum num=new PrimeNum(n);
        
        num.inputElement();
        num.displayArray();
        
        num.countOdd();
        num.CopyOdd();
        num.DisplayOdd();
        
        num.ShowPrime();
    }
}
