package app.day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.Statement;


public class Three {

	public static void main(String[] args) {
		
		Connection conn = null;
        Statement stmt = null;

        try {
        	
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","root");

            CallableStatement cstmt = conn.prepareCall("{call empprodecure(5, 'emp5')}");
            cstmt.execute();
            System.out.println("Calling the Procedure");

        } catch (Exception e) {
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