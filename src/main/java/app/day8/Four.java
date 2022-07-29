package app.day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Four {

	public static void main(String[] args) {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rSet = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","root");

            DatabaseMetaData dbData = conn.getMetaData();
            
            System.out.println(dbData.getDatabaseProductName());
            System.out.println(dbData.getDatabaseProductVersion());
            System.out.println(dbData.getDatabaseMajorVersion());
            System.out.println(dbData.getDriverName());
            System.out.println(dbData.getSchemas());

            stmt = conn.createStatement();
            rSet = stmt.executeQuery("select * from employee");

            
            while (rSet.next()){
            	ResultSetMetaData rsData = rSet.getMetaData();
                System.out.println(rsData.getColumnCount());
                System.out.println(rsData.getColumnName(1) + " " + rsData.getColumnTypeName(1));
                System.out.println(rsData.getColumnName(2) + " " + rsData.getColumnTypeName(2));
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