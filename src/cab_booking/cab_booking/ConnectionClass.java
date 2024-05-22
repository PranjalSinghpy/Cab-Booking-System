package cab_booking;

import java.sql.*;  

public class ConnectionClass 
{
    Connection con;
    Statement stm;
    public ConnectionClass()
    {  
        try
        {  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con =DriverManager.getConnection("jdbc:mysql://localhost:330/cab_booking","root","8858@Pranjal");
            stm =con.createStatement();
            if(con.isClosed())
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        catch(Exception e)
        { 
            e.printStackTrace();
            System.out.println(e);
        }  
    }
    public static void main(String args[])
    {
        new ConnectionClass();
    }
}
