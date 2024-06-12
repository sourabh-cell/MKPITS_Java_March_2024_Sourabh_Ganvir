package recordinsertiondemo;

import menudrivendatabaseoperation.DbConnection;

import java.sql.*;

public class DbOperation {

    public static void insertStundentrecord(String roll,String name,String address,String city)
    {
        Connection conn= recordupdationdemo.DbConnection.dbConnect();


        try {
            PreparedStatement preparedStatement=conn.prepareStatement("insert into studentdetails values(?,?,?,?)");
            preparedStatement.setString(1,roll);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,address);
            preparedStatement.setString(4,city);

            if (preparedStatement.executeUpdate()==1)
                System.out.println("Record inserted successfully");

            else
                System.out.println("Cannot insert record");


        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
    }





}

