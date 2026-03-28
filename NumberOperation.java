import java.util.Scanner;
interface IntOperation{
    void Checkpositivenegative();
    void Checkevenodd();
    void Prime();
    void Palindrome();
    void Factorial();
    void Sum();
}

class MyNumber implements IntOperation{
    private int num;
    MyNumber(){
        this.num=0;
    }
    MyNumber(int num){
        this.num=num;
    }
    public void Checkpositivenegative(){
        if(num==0){
            System.out.println("Number is Zero");
        }
        else if(num>0){
            System.out.println("Number "+num+" is positive");
        }
        else{
            System.out.println("Number "+num+" is negative");
        }
    }
    public void Checkevenodd(){
        if(num==0){
            System.out.println("Number "+num+" is neither even nor odd ");
        }
        else if(num%2==0){
            System.out.println("Number "+num+" is Even ");
        }
        else{
            System.out.println("Number "+num+" is Odd ");
        }
    }
    public void Prime(){
        int count=1;
        for(int i=1;i<num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Number "+num+" is Prime Number");
        }
        else{
            System.out.println("Number "+num+" is not a Prime Number");
        }
    }
    public void Palindrome(){
        int reverse=0;
        int palin=num;
        while(palin!=0){
            int rem=palin%10;
            reverse=reverse*10+rem;
            palin/=10;
        }
        if(num==reverse){
            System.out.println("Number "+num+" is Palindroe");
        }
        else{
            System.out.println("Number "+num+" is not a Palindrom number");
        }
    }
    public void Factorial(){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
    public void Sum(){
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("Sum is "+sum);
    }
}
public class NumberOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int number=sc.nextInt();
        MyNumber nu=new MyNumber(number);
        System.out.println("Enter 1 to check this number is positive or negative");
        System.out.println("Enter 2 to check this number is Even or odd");
        System.out.println("Enter 3 to check this number is Palindrome or not");
        System.out.println("Enter 4 to check this number is Prime");
        System.out.println("Enter 5 to check this number is Factorial");
        System.out.println("Enter 6 to check this number is Sum");
        System.out.println("Enter 7 to Exit");
        System.out.println("Enter Choice: ");
        int choice=sc.nextInt();
        
        switch(choice){
            case 1:
                nu.Checkpositivenegative();
                break;
            case 2:
                nu.Checkevenodd();
                break;
            case 3:
                nu.Palindrome();
                break;
            case 4:
                nu.Prime();
                break;
            case 5:
                nu.Factorial();
                break;
            case 6:
                nu.Sum();
                break;
            case 7:
                return;
            default:
                System.out.println("You entered Wrong input");
        }
    }
}
