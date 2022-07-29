package app.day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;


public class Two {

	public static void main(String[] args) {
		
		Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rSet;

        try {
        	
        	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","root");


            pstmt = conn.prepareStatement("insert into employee values (?,?)");
            pstmt.setInt(1,4);
            pstmt.setString(2,"EMP4");
            pstmt.executeUpdate();
            System.out.println("Inserting");

            pstmt = conn.prepareStatement("select * from employee");
            rSet = pstmt.executeQuery();

            while (rSet.next()){
                System.out.println(rSet.getInt("id") + " " + rSet.getString("name"));
            }

            pstmt = conn.prepareStatement("update employee set name = 'emp4' where id=4");
            pstmt.executeUpdate();
            
            System.out.println("After Updating");
            
            pstmt = conn.prepareStatement("select * from employee");
            rSet = pstmt.executeQuery();

            while (rSet.next()){
                System.out.println(rSet.getInt("id") + " " + rSet.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null){
                	conn.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}