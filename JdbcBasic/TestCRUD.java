package JdbcBasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestCRUD {
	public static void main(String[] args) throws Exception {
		testselect();
	}

	private static void testselect() throws Exception{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select* from mark");
		
		while (rs.next()) {
			System.out.print("\t"+rs.getString(1));
			System.out.print("\t"+rs.getString(2));
			System.out.print(" "+rs.getString(3));
			System.out.print("\t"+rs.getString(4));
			System.out.print("\t"+rs.getString(5));
			System.out.print("\t"+rs.getString(6));
			System.out.println("\t"+rs.getString(7));
			
			
			
		}
		rs.close();
		stmt.close();
		conn.close();
	}

	
		
	}



