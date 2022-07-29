package app.day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;


public class One {
	
	public static void main(String[] args) {
		Connection conn = null;
        ResultSet rSet = null;
        Statement stmt = null;

        try {

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","root");

            stmt = conn.createStatement();

            int count = stmt.executeUpdate("insert into employee values (3,'EMP3')");
            System.out.println("Inserting" + count);

            rSet = stmt.executeQuery("select * from employee");
            while (rSet.next()){
                System.out.println(rSet.getInt(1) + " " + rSet.getString(2));
            }

            count = stmt.executeUpdate("update employee set name = 'emp3' where id =3");
            
            System.out.println("After Updating" + count);
            
            rSet = stmt.executeQuery("select * from employee");
            while (rSet.next()){
                System.out.println(rSet.getInt(1) + " " + rSet.getString(2));
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