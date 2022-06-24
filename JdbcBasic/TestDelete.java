package JdbcBasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {
public static void main(String[] args) throws Exception {
	TestAdd();
}

private static void TestAdd() throws Exception {
	
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Marksheet","root","root");
	Statement  stmt = conn.createStatement();
	int rs = stmt.executeUpdate(" DELETE from mark where id=16");
	System.out.println("rs+record(s)Updated");
	
	conn.close();
	stmt.close();
	
}
}
