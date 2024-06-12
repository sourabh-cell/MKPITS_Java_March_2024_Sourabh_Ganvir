package recorddeletionndemo;

import java.sql.*;

public class DbOperation {



    public static void DeleteStundentrecord(String roll)
    {
        Connection conn= DbConnection.dbConnect();


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

