import java.util.Scanner;
class Student{
    String name;
    int roll;
    int mark_1;
    int mark_2;
    int mark_3;
    
    Student(String n,int r){
        name=n;
        roll=r; 
    }
    void InputMark(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter mark: ");
        mark_1=sc.nextInt();
        System.out.print("Enter mark_2: ");
        mark_2=sc.nextInt();
        System.out.print("Enter mark_3: ");
        mark_3=sc.nextInt();
        
    }
    void Display(){
        System.out.println("Name is "+name);
        System.out.println("Roll is "+roll);
        System.out.println("Mark_1 "+mark_1);
        System.out.println("Mark_2 "+mark_2);
        System.out.println("Mark_3 "+mark_3);
        
        
    }
    double getPercentage(){
        int total=mark_1+mark_2+mark_3;
        double percentage=((double)total/300)*100;
        //System.out.println("Percentage is "+percentage);
        return percentage;
    }
}
public class Studentwork{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.print("Enter your roll: ");
        int roll=sc.nextInt();
        
        Student s1=new Student(name,roll);
        s1.InputMark();
        s1.Display();
        s1.getPercentage();
        
        
        System.out.print("Enter another student: ");
        sc.nextLine();
        name=sc.nextLine();
        System.out.print("Enter Roll no: ");
        roll=sc.nextInt();
        Student s2=new Student(name,roll);
        s2.InputMark();
        s2.Display();
        s2.getPercentage();
        if(s1.getPercentage()>s2.getPercentage()){
            System.out.println("Student One has more percentage then STudent2");
        }
        else if(s1.getPercentage()<s2.getPercentage()){
            System.out.println("Student2 has more percentage then Student1");
        }
        else{
            System.out.println("Both student have same percentage");
        }
    }
}
