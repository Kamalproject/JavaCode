import java.util.Scanner;
class Person{
    Scanner sc=new Scanner(System.in);
    
    String name;
    int id;
    int year_of_join;
    void inputP(){
        System.out.print("Enter Person Name: ");
        name=sc.nextLine();
        System.out.print("What is the id of this person: ");
        id=sc.nextInt();
        System.out.print("What is the joining year: ");
        year_of_join=sc.nextInt();
    }
}

class Teacher extends Person{
    int Basic=15500;
    double da=1.1;
    double hra=.15;
    double epf=.12;
    String sub_taught;
    void inputT(){

        inputP();
        System.out.print("Which Subject taught: ");
        sub_taught=sc.nextLine(); 
        
        System.out.println("Name of the Teacher is "+name);
        System.out.println("Id is "+id);
        System.out.println("Joining Year is "+year_of_join);
        System.out.println("Subject Taught "+sub_taught);
    }
    void annualreport(){
        
        double Da=Basic*da;
        double Hra=Basic*hra;
        double Epf=Basic*epf;
        
        double Monthsalary=Basic+Da+Hra-Epf;
        double Yearsalary=Monthsalary*12;
        double Year_epf=Epf*12;
        
        System.out.println("Monthly salary is "+Monthsalary);
        System.out.println("Yearly salary is "+Yearsalary);
        System.out.println("Yearly Pf is "+Year_epf);
        
        
    }
    
}

class Student extends Person{
    
    String course_offered;
    void inputS(){
        
        System.out.println("\n");
        inputP();
        System.out.print("Which course you want to do: ");
        course_offered=sc.nextLine();
    }
    void studentdetails(){
        int duration=4;
        int feepersem=15000;
        int totalfee=(2*duration)*feepersem;
        System.out.println("Name of the Student is "+name);
        System.out.println("Id of the student is "+id);
        System.out.println("Joining Year is "+year_of_join);
        System.out.println("Course Offered to Student is "+course_offered);
        System.out.println("Total fee to compelete the course is "+ totalfee);
    }
}
public class SignleInhetance {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.inputT();
        t.annualreport();
        
        Student s=new Student();
        s.inputS();
        s.studentdetails();
    }
}
