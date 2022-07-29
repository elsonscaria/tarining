package app.day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Five {

	public static void main(String[] args) {
		
		Connection conn = null;
        Statement stmt = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","root");

            stmt = conn.createStatement();

            conn.setAutoCommit(false);

            stmt.executeUpdate("insert into training.employee values (6, 'emp6')");
            System.out.println("Inserting");

            conn.commit();

        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
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