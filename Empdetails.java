import java.util.Scanner;
class Employee{
    private int id;
    private String name;
    private String department;
    private int Salary;
    Employee(){
        id=0;
        name="";
        department="";
        Salary=0;
    }
    public int getSalary(){
        return Salary;
    }
    Employee(int id,String name,String department,int Salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.Salary=Salary;
    }
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.print("What is ID of the Employee: ");
        this.id=sc.nextInt();
        sc.nextLine();
        System.out.println("What is the name of the Employee: ");
        this.name=sc.nextLine();
        System.out.println("Which department: ");
        this.department=sc.nextLine();
        System.out.println("Salary is: ");
        this.Salary=sc.nextInt();
    }
    void display(){
        System.out.println("ID is "+this.id);
        System.out.println("Name is "+this.name);
        System.out.println("Department is "+ this.department);
        System.out.println("Salary is "+ this.Salary);
    }
}

class Manager extends Employee{
    private int Bonus;
    Manager(){
        
        Bonus=0;
    }
    Manager(int id,String name,String department,int Salary,int Bonus){
        super(id,name,department,Salary);
        this.Bonus=Bonus;
    }
    void accept(){
        Scanner sc=new Scanner(System.in);
        super.accept();
        System.out.println("What is the Bonous: ");
        this.Bonus=sc.nextInt();                
    }
    void display(){
        super.display();
        int Salary=getSalary();
        System.out.println("Bonus is "+ this.Bonus);
        System.out.println("Total Salary is: "+ (this.Bonus+Salary));
    }
    
}
public class Empdetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n=sc.nextInt();
        Manager obj[]=new Manager[n];
        for(int i=0;i<n;i++){
            obj[i]=new Manager();
            obj[i].accept();
        }
        System.out.println();
        System.out.println("Employee Details");
        for(int i=0;i<n;i++){
            System.out.println();
            obj[i].display();
        }
    }
}
