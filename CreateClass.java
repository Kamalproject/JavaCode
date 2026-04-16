import java.sql.*;
public class CreateClass {
    public static void main(String[] args)throws Exception {
        try{
            Class.forName("org.postgresql.Driver");
            System.out.println("Register the Drivewr class");
            try(Connection c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Firsttable","postgres","1234")){
                System.out.println("Successfullt create the Connection");
                Statement s=c.createStatement();
                System.out.println("Statement created ");
                s.executeUpdate("create table Student(Name varchar(30),Roll int, Course varchar(50),PRIMARY KEY(Roll))");
                System.out.println("Student table created Successfully");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
