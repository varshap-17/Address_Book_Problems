package ab.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class NewContactuc20 {
	public static void main(String[] args) {
		Connection con=null;
		Statement stm=null;
		String query=("insert into address_book_service.address_book(firstname,lastname,type,address,city,state,zip,phone_no,email,date_added) Values"
				+ "('ammu','manan','friend','a m city','kolkata','west bengal','265','9558462715','amana@gmail.com','2022-08-20')");
		try {
			//step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver registered");
			//step 2
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=varsha-sql");
			System.out.println("Connection established");
			//step 3
			con.setAutoCommit(false);
			stm=con.createStatement();
			System.out.println("Platform created");
			stm.executeUpdate(query);
			System.out.println("data inserted");
		}catch(Exception e) {
			e.getStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.rollback();
					con.close();
				}catch(SQLException e) {
					System.out.println(e.getMessage());
				}
			}
	     }
	}
}
