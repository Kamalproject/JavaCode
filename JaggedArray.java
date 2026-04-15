import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Elements in array 0: ");
        int nu=sc.nextInt();
        System.out.print("Elements in array 1: ");
        int num=sc.nextInt();
        int arr[][]=new int[2][];
        arr[0]=new int[nu];
        arr[1]=new int[num];
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"");
            }
            System.out.println("");
        }
    }
}
