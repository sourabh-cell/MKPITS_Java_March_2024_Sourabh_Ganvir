package menudrivendatabaseoperation;

import menudrivendatabaseoperation.pojoclassstudent.Student;

import java.sql.*;

public class DbOperation {


    public static void displayStudentbyRoll(String roll)
    {
        Connection conn=DbConnection.dbConnect(); //calling static dbconnect method which return Connection  object
        try{
            //createStatement() method which return object of Statement
            Statement statement=conn.createStatement();

            //passing query to executeQuery() which return result of type ResultSet
            ResultSet resultSet= statement.executeQuery("select * from studentdetails where roll_no ="+roll);

            //passing metadata of resultSet to ResultsetsetMetaData
            ResultSetMetaData resultSetMetaData=resultSet.getMetaData();

            //extracting column count using metada
            int column_count=resultSetMetaData.getColumnCount();

            for (int i = 1; i <=column_count ; i++) {
                System.out.print(resultSetMetaData.getColumnName(i)+"\t\t\t"); //printing column
            }
            System.out.println();
            if (resultSet.next())
            {
                //printing record
                System.out.print("\t"+resultSet.getString(1)+"\t\t\t"+resultSet.getString(2)+"\t\t\t"+resultSet.getString(3));
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void insertStundentrecord(Student s)
    {
        Connection conn=DbConnection.dbConnect();


        try {
            PreparedStatement preparedStatement=conn.prepareStatement("insert into studentdetails values(?,?,?,?)");
            preparedStatement.setString(1,s.getRoll());
            preparedStatement.setString(2,s.getName());
            preparedStatement.setString(3,s.getAddress());
            preparedStatement.setString(4,s.getCity());

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

    public static void updateStundentrecord(Student s)
    {
        Connection conn=DbConnection.dbConnect();


        try {
            PreparedStatement preparedStatement=conn.prepareStatement("update studentdetails set name=?,address=?,city=? where roll_no=?");

            preparedStatement.setString(1,s.getName());
            preparedStatement.setString(2,s.getAddress());
            preparedStatement.setString(3,s.getCity());
            preparedStatement.setString(4,s.getRoll());

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


    public static void DeleteStundentrecord(String roll)
    {
        Connection conn=DbConnection.dbConnect();


        try {
            PreparedStatement preparedStatement=conn.prepareStatement("delete from studentdetails where roll_no=?");


            preparedStatement.setString(1,roll);

            if (preparedStatement.executeUpdate()==1)
                System.out.println("Record deleted successfully");

            else
                System.out.println("Cannot delete record");


        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
    }

}

