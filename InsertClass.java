import java.sql.*;
public class InsertClass {
    public static void main(String[] args)throws Exception{
        try{
            Class.forName("org.postgresql.Driver");
            try(Connection c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Firsttable","postgres","1234")){
                Statement s=c.createStatement();
                s.executeUpdate("insert into student values('Jyoti','2570100','MCA'),('Jagan','2570092','MCA')");
                System.out.println("Information Inseted Successfully ");
                s.close();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
