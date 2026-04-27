package Gym;
import java.sql.*;

public class DBUtil {
    public static Connection getConnection() throws Exception{
        String url = "jdbc:mysql://localhost:3306/gymdb";
        String user = "gym";
        String password = "gym1234";

        return DriverManager.getConnection(url,user,password);
    }

    public static Connection getConnection(String user, String password) throws Exception{
        String url = "jdbc:mysql://localhost:3306/gymdb";
        return DriverManager.getConnection(url,user,password);
    }

    public static Connection getConnection(String url, String user, String password) throws Exception{
        return DriverManager.getConnection(url,user,password);
    }
}
