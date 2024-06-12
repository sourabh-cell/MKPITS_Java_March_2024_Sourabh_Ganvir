package recordupdationdemo;

import menudrivendatabaseoperation.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbOperation {

    public static void updateStundentrecord(String roll,String name,String address,String city)
    {
        Connection conn= DbConnection.dbConnect();


        try {
            PreparedStatement preparedStatement=conn.prepareStatement("update studentdetails set name=?,address=?,city=? where roll_no=?");

            preparedStatement.setString(1,name);
            preparedStatement.setString(2,address);
            preparedStatement.setString(3,city);
            preparedStatement.setString(4,roll);

            if (preparedStatement.executeUpdate()==1)
                System.out.println("Record updated successfully");

            else
                System.out.println("Cannot update record");


        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
    }


}

