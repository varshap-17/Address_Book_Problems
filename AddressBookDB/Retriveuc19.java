package ab.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Retriveuc19 {
	public static void main(String[] args) {
		Connection con=null;
		Statement stm=null;
		String query=("Select city from address_book_service.address_book");
		String query1=("Select state from address_book_service.address_book");
		try {
			//step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver registered");
			//step 2
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=varsha-sql");
			System.out.println("Connection established");
			//step 3
			stm=con.createStatement();
			System.out.println("Platform created");
			stm.execute(query);
			System.out.println("data retrived");
			stm.execute(query1);
			System.out.println("data retrived");
	}catch(Exception e) {
		e.getStackTrace();
	}finally {
		if(con!=null) {
			try {
				con.close();
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}
     }
	}
}
