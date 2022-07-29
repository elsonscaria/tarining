package app.day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Six {

	public static void main(String[] args) {
		Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rSet = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","root");
            
            //Statement
            stmt = conn.createStatement();
            stmt.addBatch("insert into training.employee values(7,'emp7')");
            stmt.addBatch("insert into training.employee values(8,'emp8')");

            stmt.executeBatch();

            //Prepared Statement
            pstmt = conn.prepareCall("insert into training.employee values(?,?)");
            
            pstmt.setInt(1, 9);
            pstmt.setString(2, "emp9");
            pstmt.addBatch();
            
            pstmt.setInt(1, 10);
            pstmt.setString(2, "emp10");
            pstmt.addBatch();
            
            pstmt.executeBatch();

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