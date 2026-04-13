import java.util.Scanner;
class Employee{
    String E_name;
    int Emp_No;
    int Wor_day;
    int Wok_hour;
    int Sal_per_hour;
    int Total_salary;
    Employee(){
        E_name="Kamal";
        Emp_No=256;
        Wor_day=17;
        Wok_hour=8;    
        Sal_per_hour=500;
    }
    Employee(String n,int e_no){
        E_name=n;
        Emp_No=e_no;
    }
    void InputDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Working days: ");
        Wor_day=sc.nextInt();
        System.out.print("Enter Your Working hour: ");
        Wok_hour=sc.nextInt();
        System.out.print("Enter Salary per hour: ");
        Sal_per_hour=sc.nextInt();       
    }
    void CalculateSary(){
        Total_salary=Wor_day*Wok_hour*Sal_per_hour;
    }
    void Display(){
        System.out.println("Name of the Employee is: "+E_name);
        System.out.println("Employee no is "+Emp_No);
        System.out.println("Working day is "+Wor_day);
        System.out.println("Working hour is "+Wok_hour);
        System.out.println("Salary per hour "+Sal_per_hour);
        System.out.println("Total Salary is "+Total_salary);        
    }
}
public class Employeework {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee e1=new Employee();
        e1.CalculateSary();
        e1.Display();
        System.out.print("Enter Your Name: ");
        String name=sc.nextLine();
        System.out.print("Enter your Employee number: ");
        int emp_no=sc.nextInt();
        Employee e2=new Employee(name,emp_no);
        e2.InputDetails();
        e2.CalculateSary();
        e2.Display();
    }
}
