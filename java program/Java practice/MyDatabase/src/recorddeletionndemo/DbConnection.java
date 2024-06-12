package recorddeletionndemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static Connection dbConnect(){
        Connection conn = null;

        try{
            Class.forName(DbConfig.driver);
            System.out.println("Driver Loaded ....");
            conn= DriverManager.getConnection(DbConfig.url, DbConfig.username, DbConfig.password);
            System.out.println("Connection Establish...");
        }
        catch (ClassNotFoundException e){
            System.out.println(e);

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    return conn;
    }
}
